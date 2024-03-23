# [JAVA] - BUỔI 7
# INTERFACE VÀ TRỪU TƯỢNG

## I. Abstract Class
### 1. Đặc điểm của abstract class
- Một lớp được khai báo với từ khóa abstract là lớp trừu tượng (abstract class).
- Lớp trừu tượng có thể có các phương thức abstract hoặc non-abtract.
- Lớp trừu tượng có thể khai báo 0, 1 hoặc nhiều method trừu tượng bên trong.
- Không thể khởi tạo 1 đối tượng trực tiếp từ một class trừu tượng.
- Một lớp kế thừa từ lớp trừu tượng (subclass – lớp con) không cần phải implement non-abstract methods, nhưng những method nào có abstract thì bắt buộc phải override. Trừ khi subclass cũng là abstract.
- Cú pháp: 
```
<PhamViTruyCap> abstract class <TenLop> {
     
}
```
### 2. Phương thức trừu tượng trong Java
- Một phương thức được khai báo là abstract và không có trình triển khai thì đó là phương thức trừu tượng (abstract method).
- Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng bạn muốn triển khai thực sự phương thức đó để được quyết định bởi các lớp con, thì bạn có thể khai báo phương thức đó trong lớp cha ở dạng abstract.
- Từ khóa abstract được sử dụng để khai báo một phương thức dạng abstract. Phương thức abstract sẽ không có định nghĩa, được theo sau bởi dấu chấm phẩy, không có dấu ngoặc nhọn theo sau.
- Cú pháp:
```
<PhamViTruyCap> abstract void <TenPhuongThuc>();
```
### 3. Lưu ý
- Lớp con bắt buộc phải cài đặt (implement) tất cả các phương thức trừu tượng của lớp cha
- Không thể khởi tạo trực tiếp một lớp trừu tượng
  
- Ví dụ:
Shape.java
```
public abstract class Shape {
    private String color = "red";
     
    public Shape() {
         
    }
     
    public abstract void draw();
     
    public String getColor() {
        return color;
    }
}
```
Rectangle.java
```
public class Rectangle extends Shape {
 
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " rectangle");
    }
     
}
```
Circle.java
```
public class Circle extends Shape {
 
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " circle");
    }
     
}
```
ShapeApp.java
```
public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();
        System.out.println("---");
        Shape circle = new Circle();
        circle.draw();      
    }
}
```
Kết quả:
```
Draw red rectangle
---
Draw red circle
```
## II. Interface
- Interface là một kiểu dữ liệu tham chiếu trong Java. Nó là tập hợp các phương thức abstract (trừu tượng). Khi một lớp kế thừa interface, thì nó sẽ kế thừa những phương thức abstract của interface đó.
- Một số đặc điểm của interface:
  - Luôn luôn có modifier là: public interface, cho dù bạn có khai báo rõ hay không.
  - Không thể khởi tạo, nên không có phương thức khởi tạo.
  - Các method của nó đều là method trừu tượng, nghĩa là không có thân hàm, và đều có modifier là: public abstract, cho dù bạn có khai báo hay không.
  - Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo, yêu cầu phải có giá trị.
- Mục đích của interface là để thay thế đa kế thừa lớp của những ngôn ngữ khác (ví dụ như C++, Python…). Ngoài ra, interface sẽ giúp đồng bộ và thống nhất trong việc phát triển hệ thống trao đổi thông tin.
### So sánh abstract class và interface trong Java
| Lớp trừu tượng (abstract class)                                              | Interface                                                                                                                                                                 |
| ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Thể hiện tính trừu tượng < 100%                                              | Thể hiện tính trừu tượng 100% (Java < 8).                                                                                                                                 |
| Lớp trừu tượng có thể có các phương thức abstract và non-abstract            | Phiên bản Java < 8, Interface chỉ có thể có phương thức abstract. Phiên bản Java 8, có thể thêm default và static methods. Phiên bản Java 9, có thể thêm private methods. |
| Lớp trừu tượng không hỗ trợ đa kế thừa                                       | Interface hỗ trợ đa kế thừa                                                                                                                                               |
| Lớp trừu tượng có thể có các biến final, non-final, static và non-static     | Interface chỉ có các biến static final                                                                                                                                    |
| Lớp trừu tượng có thể có phương thức static, phương thức main và constructor | Interface không thể có phương thức static, main hoặc constructor.                                                                                                         |
| Từ khóa abstract được sử dụng để khai báo lớp trừu tượng                     | Từ khóa interface được sử dụng để khai báo Interface                                                                                                                      |
| Lớp trừu tượng có thể cung cấp trình triển khai của Interface                | Interface không cung cấp trình triển khai cụ thể của lớp abstract                                                                                                         |
- Ví dụ: 
```
public abstract class Shape {
  public abstract void draw();
}
```
- Ví dụ:
```
public interface Drawable {
  void draw();
} 
```
## III. Tính trừu tượng
- Tính trừu tượng (abstraction) là một trong bốn tính chất cơ bản của lập trình hướng đối tượng trong Java.
- Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề. Đó là một quá trình che giấu các hoạt động bên trong và chỉ hiển thị những tính năng thiết yếu của đối tượng tới người dùng. 
- Ví dụ: một người sử dụng điện thoại để gửi tin nhắn thì anh ta sẽ nhập nội dung tin nhắn, thông tin người nhận và ấn nút gửi. Khi anh ta bắt đầu gửi tin thì anh ấy không biết những gì diễn ra bên trong quá trình gửi mà chỉ biết được là kết quả của tin nhắn đã được gửi đến người nhận thành công hay chưa. Vì vậy trong ví dụ này, quá trình gửi tin nhắn đã được ẩn đi và chỉ hiển thị những chức năng mà người dùng cần đó là chức năng nhập nội dung tin nhắn, thông tin người nhận, kết quả gửi tin nhắn thành công hay thất bại. Đó chính là tính trừu tượng.
- Ưu điểm khi sử dụng tính trừu tượng để lập trình:
  - Tính trừu tượng cho phép các lập trình viên loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình, cải thiện khả năng bảo trì của hệ thống.
  - Tính trừu tượng giúp chúng ta tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
  - Tính trừu tượng cung cấp nhiều tính năng mở rộng khi sử dụng kết hợp với tính đa hình và kế thừa trong lập trình hướng đối tượng.
- Java trừu tượng hóa thông qua các lớp trừu tượng (Abstract class) và các giao diện (Interface). 
## IV. Khi nào dùng interface, khi nào dùng abstract class

- Sử dụng Abstract class khi chúng ta chỉ có thể hoàn thành một vài chức năng (method/ function) chuẩn của hệ thống, một vài chức năng còn lại các lớp extends phải hoàn thành. Những tính năng đã hoàn thành này vẫn sử dụng như bình thường, đây là những tính năng chung.
- Sử dụng Interface khi bạn muốn tạo dựng một bộ khung chuẩn gồm các chức năng (method/ function) mà tất cả module/ project cần phải có. Các module phải implements tất cả chức năng đã được định nghĩa.
