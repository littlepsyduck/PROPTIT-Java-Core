# [JAVA] - BUỔI 11
# CÁC NGUYÊN TẮC THIẾT KẾ, MÔ HÌNH THIẾT KẾ

```
Nội dung:
SOLID là gì? (3 phần đầu)
KISS, DRY, YAGNI
Mô hình MVC
```
## I. Giới thiệu về S.O.L.I.D
> SOLID là viết tắt của 5 chữ cái đầu trong 5 nguyên tắc thiết kế hướng đối tượng. Mục đích giúp cho các coder đọc được dễ hiểu hơn, dễ nắm bắt được những ý chính hơn. 
 
- Những nguyên tắc này đã được đưa ra bởi Michael Feathers và Robert C.Martin bao gồm: 

  - ***Single Responsibility (SRP):*** Nguyên tắc Đơn nhiệm
  - ***Open/Closed (OCP):*** Nguyên tắc Mở/Đóng.
  - ***Liskov Substitution (LSP):*** Nguyên tắc Thay thế Liskov
  - ***Interface Segregation (ISP):*** Nguyên tắc Phân tách Interface
  - ***Dependency Inversion (DIP):*** Nguyên tắc Đảo ngược Phụ thuộc 
  
![](https://www.thoughtworks.com/content/dam/thoughtworks/images/photography/inline-image/insights/blog/agile-engineering-practices/blg_inline_solid_principles.png)

### Single Responsibility (SRP): Nguyên tắc Đơn nhiệm
 
> *"Each class should be responsible for a single part or functionality of the system."*

***Một class chỉ nên giữ 1 trách nhiệm duy nhất.***

- ***Mục đích:***
  - ***Kiểm thử chức năng:*** Class chỉ có 1 nhiệm vụ nên việc test hoặc làm unit rất đơn giản chỉ cần vài testcase có thể kiểm tra được chất lượng code.
  - ***Giảm phụ thuộc:*** Ít chức năng trong class dẫn đến ít sự phụ thuộc.
  - ***Tổ chức code của dự án:*** Các file code càng nhỏ thì dễ quản lý và tìm kiếm.

- Ví dụ:

```java
public class Book {
 
    private String name;
    private String text;
 
    public String replaceWordInText(String word){
        this.text = this.text.replaceAll(word, text);
    }
}
```

- Lớp Book ở trên gồm có 1 phương thức là tìm kiếm từ trong đoạn văn (replaceWordInText).

- Thêm chức năng in ra màn hình:

```java
public class Book {
 
    private String name;
    private String text;
 
    public String replaceWordInText(String word){
        this.text = this.text.replaceAll(word, text);
    }
    public void printText () {
        System.out.println(this.text);
    }
}
```

- Lớp Book chỉ nên làm một nhiệm vụ và có trách nhiệm trong việc tìm kiếm. Do vậy chức năng in phải di chuyển ra nơi khác và tạo một class khác chuyên cho việc in.

```java
public class BookPrinter {
    public void printText (String text) {
        System.out.println(text);
    }
}
```

### Open/Closed (OCP): Nguyên tắc Mở/Đóng.
> "Software components should be open for extension, but not for modification."

***Có thể thoải mái mở rộng 1 class, nhưng không được sửa đổi bên trong class đó.***

- Theo nguyên lý này, mỗi khi ta muốn thêm chức năng cho chương trình, thay vì sửa ở class cũ thì nên viết class mở rộng class cũ.
- Close Modification:không nên sửa đổi code đang có, đều này cực kỳ nghiêm trọng vì có những lúc code cũ đang chạy ổn định. Vô tình sửa vài dòng code có thể ảnh hưởng tới các chức năng khác gây nên tình trạng lỗi.
- Ví dụ:

```java
public class Guitar {
 
    private String model;
    private int volume;
 
    //Constructors, getters & setters
}
```

- Thêm chức năng:

```java
public class GuiterPurchaseDate extends Guitar {
 
    private String date;
    
    //constructor, getters & setters
}
```

### Liskov Substitution (LSP): Nguyên tắc Thay thế Liskov
> "Objects of a superclass should be replaceable with objects of its subclasses without breaking the system."

***Các đối tượng (instance) kiểu class con có thể thay thế các đối tượng kiểu class cha mà không gây ra lỗi.***

- Nếu lớp S là con của lớp T, thì các đối tượng của lớp T có thể được thay thế bởi các đối tượng của lớp S mà không gây ảnh hưởng tới hành vi của hệ thống.

```java
public class Car {
    void startEngine() throws Exception {
        //turn on the engine
    }
}

class SpaceCar extends Car {
    // implementation specific to Space Car
}

class ElectricCar extends Car {
    void startEngine() throws Exception {
        throw new Exception("Electric cars have no engine!");
    }
}

```

- Giả sử có lớp cha Car và 2 lớp con SpaceCar & ElectricCar. ElectricCar không có động cơ để khởi động, vì vậy phải ghi đè phương thức `startEngine()`. 
- Tuy nhiên, việc này không vi phạm nguyên tắc Liskov Substitution vì ta vẫn có thể thay thế một đối tượng ElectricCar vào bất kỳ nơi nào mà sử dụng đối tượng Car mà không cần thay đổi mã nguồn hiện có.

## II. KISS, DRY, YAGNI
### 1. KISS (Keep It Simple, Stupid!)

***Giữ cho code thật đơn giản, càng đơn giản, ngắn gọn càng tốt. Đây là mục đích trọng tâm trong thiết kế, còn những cái phức tạp không cần thiết thì nên tránh.***

- Áp dụng:
  - Đặt tên hàm, biến, method, class, package, comment rõ nghĩa.
  - Không lạm dụng framework, pattern.
  - Chia vấn task lớn thành các task nhỏ hơn để code 1 cách rõ ràng.
  - Giới hạn mỗi method chỉ nên từ 30-50 lines, và mỗi method chỉ nên thực hiện 1 chức năng.
  - Hiểu rõ các vấn đề trước khi code.
  - Không nên sử dụng nhiều câu lệnh If trong 1 method, hãy tách nó ra thành các method khác nhau.

- Ví dụ: 

```java
// method 1
public static boolean isOdd(int input){
    return (input & 1) == 1;
}

// method 2
public static boolean isOdd(int input){
    return (input % 2) == 1;
}
```

- Ở đây method 1 nhanh hơn method 2 vì nó thực hiện trực tiếp với bit. Nhưng method 2 lại dễ hiểu hơn, người đọc không cần nhớ lại toán tử ‘&’ thực hiện như nào.

### 2. DRY (Don’t Repeat Yourself)
***Nếu chúng ta có nhiều đoạn code giống nhau ở nhiều chỗ khác nhau, thay vì sao chép, dán, hãy đưa nó vào 1 phương thức riêng và gọi phương thức này ở chỗ cần áp dụng.***

- Giúp code rõ ràng, dễ sửa lỗi. 

```java
public void showUser(User user){
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
    

    
    public void updateInfo(User user){
        showUser(user);
        // update infomation
    }
    
    public void printReview(User user){
        showUser(user);
        // show review
    }
```

### 3. YAGNI (“You Aren’t Gonna Need It”)
***Không nên triển khai chức năng cho đến khi thực sự cần thiết.***

- Tránh tối ưu hóa sớm, thiết kế quá phức tạp và thêm các tính năng không cần thiết. 
- Mất thời gian, sự tập trung và công sức. 

## III. Mô hình MVC (Model – View – Controller)
> Cấu trúc Model-View-Controller (MVC) là một mẫu kiến trúc/mẫu thiết kế (design pattern) tách ứng dụng thành ba thành phần logic chính: Model, View và Controller. Mỗi thành phần kiến trúc được xây dựng để xử lý các khía cạnh phát triển cụ thể của một ứng dụng.

![](https://itviec.com/blog/wp-content/uploads/2023/12/mo-hinh-mvc-la-gi-vippro.png)

- Model:
    - Model là các thành phần của ứng dụng tương ứng với tất cả logic liên quan đến miền dữ liệu (data domain), hoặc nói ngắn gọn đây là phần back-end chứa tất cả logic dữ liệu của ứng dụng.
    - Dữ liệu ở đây có thể là dữ liệu đang được truyền giữa các thành phần View và Controller hoặc bất kỳ dữ liệu nào khác liên quan đến logic của doanh nghiệp.
    - Nếu trạng thái của dữ liệu này thay đổi thì Model thường sẽ thông báo cho View (để màn hình có thể thay đổi khi cần) và đôi khi là Controller (nếu cần logic khác để cập nhật View).
- View:
  - View là các thành phần hiển thị giao diện người dùng (UI) của ứng dụng. Thông thường, giao diện người dùng này được tạo từ dữ liệu Model.
- Controller:
  - Controller là các thành phần xử lý tương tác của người dùng để làm việc với Model (cập nhật logic dữ liệu) hoặc/ và với View (cập nhật hiển thị giao diện người dùng). Trong ứng dụng MVC, Controller xử lý các giá trị chuỗi truy vấn và chuyển các giá trị này cho Model, từ đó Model sẽ truy vấn cơ sở dữ liệu bằng cách sử dụng các giá trị đó. View hiển thị thông tin do Controller xử lý và phản hồi đầu vào từ tương tác của người dùng.

### 1. Model 

```java
package BookStore;

public class Book {
    private String name;
    private int author;
    private String status;
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setAuthor (int author) {
        this.author = author;
    }
    public int getAuthor () {
        return this.author;
    }
    public void setStatus (String status) {
        this.status = status;
    }
    public String getStatus () {
        return this.status;
    }
}
```

### 2. View

```java
package BookStore;

import java.util.Scanner;

public class BookView {
    Scanner sc = new Scanner(System.in);
    public void display (Book book) {
        System.out.println(STR."Name: \{book.getName()}");
        System.out.println(STR."Author: \{book.getAuthor()}");
        System.out.println(STR."Status: \{book.getStatus()}");
    }
    public Book getInfo () {
        Book book = new Book();
        System.out.println("Enter info");
        System.out.println("Name: ");
        book.setName(sc.nextLine());
        System.out.println("Author: ");
        book.setAuthor(Integer.parseInt(sc.nextLine()));
        return book;
    }
}

```

### 3. Controller

```java
package BookStore;

public class BookController {
    Book book = new Book();
    BookView bookView = new BookView();
    public void changeStatus () {
        book.setName("...");
    }
    public void updateName() {
        book = bookView.getInfo();
        changeStatus();
        bookView.display(book);
    }
}

```

#### Bước 4: Chạy hàm main() 

```java
public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.updateStatus();
    }
}
```

