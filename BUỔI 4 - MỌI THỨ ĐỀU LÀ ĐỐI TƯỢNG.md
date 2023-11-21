# [JAVA] - BUỔI 4 
# MỌI THỨ ĐỀU LÀ ĐỐI TƯỢNG

## I. Tính đóng gói trong Java
- Là kỹ thuật ẩn giấu thông tin không liên quan và hiện thị ra thông liên quan. Mục đích chính của đóng gói trong java là giảm thiểu mức độ phức tạp phát triển phần mềm.

- Là một tiến trình đóng gói code và dữ liệu lại với nhau vào trong một đơn vị unit đơn. Chúng ta có thể tạo một lớp được bao đóng hoàn toàn trong Java bằng việc tạo tất cả thành viên dữ liệu của lớp là private. Chúng ta sử dụng phương thức public setter và getter để thiết lập và lấy dữ liệu trong nó.

- Để đạt được đóng gói trong Java chúng ta cần:
    - Khai báo các biến của một lớp là private.
    - Cung cấp phương thức setter và getter là public để có thể sửa đổi và xem các giá trị biến.

Ví dụ: 
```java
public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
```

> Các phương thức public setXXX() và getXXX() là các điểm truy cập đến các biến của lớp Student. Thông thường, các phương thức này được gọi là getters và setters. Vì vậy, bất kỳ đối tượng nào nào muốn truy cập vào các biến private sẽ truy cập chúng thông qua các trình getters và setters này.

### Lợi ích của đóng gói trong java:
- Tất cả các trường (field) của lớp có chế độ chỉ đọc (read-only) hoặc chỉ ghi (write-only), tức là chỉ có hàm getter hoặc setter.
  
- Một lớp có thể có toàn bộ điều khiển thông qua những gì được lưu giữ trong các trường (field) của nó.
  
- Người sử dụng của class không biết cách các class lưu trữ dữ liệu. Một class có thể thay đổi kiểu dữ liệu của một trường và người dùng class không cần sự thay đổi trong code.

## II. Tính kế thừa trong Java

- Kế thừa là sự liên quan giữa hai class với nhau, trong đó có class cha (superclass) và class con (subclass). Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha. Tuy nhiên, nó chỉ được truy cập các thành viên public và protected của class cha. Nó không được phép truy cập đến thành viên private của class cha.

- Tư tưởng của kế thừa trong java là có thể tạo ra một class mới được xây dựng trên các lớp đang tồn tại. Khi kế thừa từ một lớp đang tồn tại bạn có sử dụng lại các phương thức và thuộc tính của lớp cha, đồng thời có thể khai báo thêm các phương thức và thuộc tính khác.
  
- Từ khóa extends được sử dụng để thể hiện sự kế thừa của một lớp.

Cú pháp:
```java
class Super {

}
class Sub extends Super {

}
```
Ví dụ:
```java
public class Employee {

    protected int salary = 40000;

}
////////////////////////////////
public class Programmer extends Employee {

    int bonus = 10000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }

}

```
> Trong ví dụ trên, class Programmer là con của class Employee, nên nó được phép truy cập đến field salary của class Employee.

### Các kiểu kế thừa trong Java

- Có 3 kiểu kế thừa trong java: đơn kế thừa (single), kế thừa nhiều cấp (multilevel), kế thừa thứ bậc (hierarchical).
- Khi một class được kế thừa từ nhiều class đươc gọi là đa kế thừa.

- Trong java, một class không được phép thừa kế từ nhiều class, có thể cài đặt (implement) nhiều interface. Tuy nhiên, một interface có thể thừa kế nhiều interface.
Hay nói cách khác class trong Java không có tính đa kế thừa


![](https://gpcoder.com/wp-content/uploads/2017/11/types-of-inheritance.png)

- Ví dụ Đơn kế thừa :

```java
public class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}
public class Dog extends Animal {
    public void bark() {
        System.out.println("barking...");
    }
}
public class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
Kết quả
`barking...`
`eating...`

Ví dụ Kế thừa nhiều cấp :
```java
public class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}
public class Dog extends Animal {
    public void bark() {
        System.out.println("barking...");
    }
}
public class BabyDog extends Dog {
    public void weep() {
        System.out.println("weeping...");
    }
}
public class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
```
Kết quả:
`weeping...`
`barking...`
`eating..`

Ví dụ Kế thừa thứ bậc:
```java
class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("barking...");
    }
}
public class Cat extends Animal {
    public void meow() {
        System.out.println("meowing...");
    }
}
public class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
```
Kết quả:
`meowing...`
`eating...`

### Lợi ích của kế thừa trong Java
- Để ghi đè phương thức (Method Overriding), do đó có thể thu được tính đa hình tại runtime.
  
- Để làm tăng tính tái sử dụng của code.

### Tại sao đa kế thừa không được support trong Java

- Để giảm thiểu sự phức tạp và đơn giản hóa ngôn ngữ, đa kế thừa không được support trong java.
Hãy suy xét kịch bản sau: Có 3 lớp A, B, C. Trong đó lớp C kế thừa từ các lớp A và B. Nếu các lớp A và B có phương thức giống nhau và bạn gọi nó từ đối tượng của lớp con, như vậy khó có thể xác đinh được việc gọi phương thức của lớp A hay B.

- Java sẽ print ra lỗi “compile time error” nếu bạn cố tình kế thừa 2 class.

```java
public class Printable {
    void print() {
        System.out.println("Printable");
    }
}  
public class Showable {  
    void print() {
        System.out.println("Showable");
    }
}  
// Không thể thực hiện đa thừa kế với class
public class MultiHeritanceExample extends Printable, Showable {  
    public static void main(String args[]) {  
        MultiHeritanceExample obj = new MultiHeritanceExample();  
        obj.print();  // Không thể xác định được gọi phương thức print() của class nào
    }  
}  
```
## III. Tính đa hình trong Java

- Là khả năng một đối tượng có thể thực hiện một tác vụ theo nhiều cách khác nhau.

-  Được thể hiện rõ nhất qua việc gọi phương thức của đối tượng. Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau. Nói cách khác: Tính đa hình cung cấp khả năng cho phép người lập trình ***gọi trước một phương thức của đối tượng***, tuy chưa xác định đối tượng có phương thức muốn gọi hay không. Đến khi thực hiện (run-time), chương trình mới xác định được đối tượng và gọi phương thức tương ứng của đối tượng đó.

- Trong Java, chúng ta sử dụng nạp chồng phương thức (method overloading) và ghi đè phương thức (method overriding) để có tính đa hình.
    - Nạp chồng (Overloading): Đây là khả năng cho phép một lớp có nhiều thuộc tính, phương thức cùng tên nhưng với các tham số khác nhau về loại cũng như về số lượng. Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.
    - Ghi đè (Overriding): là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng thằng con viết lại và dùng theo cách của nó, và xuất hiện ở lớp cha và tiếp tục xuất hiện ở lớp con. Khi dùng override, lúc thực thi, nếu lớp Con không có phương thức riêng, phương thức của lớp Cha sẽ được gọi, ngược lại nếu có, phương thức của lớp Con được gọi.

### Đa hình lúc runtime trong java
- Đa hình lúc runtime là quá trình gọi phương thức đã được ghi đè trong thời gian thực thi chương trình. Trong quá trình này, một phương thức được ghi đè được gọi thông qua biến tham chiếu của một lớp cha.
```java
public class Bike {
    public void run() {
        System.out.println("running");
    }
}
 ////////////////////////////////
public class Splender extends Bike {
    public void run() {
        System.out.println("running safely with 60km");
    }
 
    public static void main(String args[]) {
        Bike b = new Splender(); // upcasting 
        b.run();
    }
}
```
Output:
> running safely with 60km

- Chúng ta tạo hai lớp Bike và Splendar. Lớp Splendar kế thừa lớp Bike và ghi đè phương thức run() của nó. Chúng ta gọi phương thức run bởi biến tham chiếu của lớp cha. Khi nó tham chiếu tới đối tượng của lớp con và phương thức lớp con ghi đè phương thức của lớp cha, phương thức lớp con được triệu hồi tại runtime.

- Trong ví dụ sau đây, cả hai lớp có một thành viên dữ liệu là speedlimit, chúng ta truy cập thành viên dữ liệu bởi biến tham chiếu của lớp cha mà tham chiếu tới đối tượng lớp con. Khi chúng ta truy cập thành viên dữ liệu mà không bị ghi đè, thì nó sẽ luôn luôn truy cập thành viên dữ liệu của lớp cha.

```java
class Bike {
    int speedlimit = 90;
}
 
class Honda3 extends Bike {
    int speedlimit = 150;
 
    public static void main(String args[]){  
      Bike obj=new Honda3();  
      System.out.println(obj.speedlimit); // 90  
    }
}
```
### Nạp chồng phương thức (method overloading)
- Nếu một lớp có nhiều phương thức cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số lượng các tham số, thì đó là nạp chồng phương thức (Method Overloading).

- Nạp chồng phương thức được sử dụng để thu được tính đa hình lúc biên dịch (compile).

- Có 2 cách nạp chồng phương thức trong java

    - Thay đổi số lượng các tham số
    - Thay đổi kiểu dữ liệu của các tham số
```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }
 
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
 
class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(5, 5));
        System.out.println(Adder.add(5, 5, 5));
    }
}
```
Output:
> 10
> 15
```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(5, 5));
        System.out.println(Adder.add(4.3, 5.6));
    }
}
```
Output:
> 10
> 9.9

- Trong java, không thể nạp chồng phương thức bằng cách chỉ thay đổi kiểu trả về của phương thức bởi vì không biết phương thức nào sẽ được gọi.
```java
class Adder {
    static int add(int a, int b) {
        return a + b;
    }
 
    static double add(int a, int b) {
        return a + b;
    }
}
 
class TestOverloading3 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11)); // Không biết gọi phương thức nào
    }
}
```
- Có thể nạp chồng n phương thức main. Nhưng JVM chỉ gọi phương thức main() có tham số truyền vào là một mảng String.
### Nạp chồng phương thức và tự động ép kiểu
- Kiểu dữ liệu của đối số truyền vào được thay đổi sang kiểu dữ liệu khác (tự động ép kiểu) nếu giá trị của đối số đó không phù hợp với kiểu dữ liệu của tham số đã được đinh nghĩa.
![](https://gpcoder.com/wp-content/uploads/2017/11/type-casting.jpg)
```java
class OverloadingCalculation1 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }
 
    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
 
    public static void main(String args[]) {
        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(20, 20);// now second int literal will be promoted to long
        obj.sum(20, 20, 20);
 
    }
}
```
Output:
> 40
> 60
### Ghi đè phương thức (method overriding)
- Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.

- Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè phương thức (method overriding) trong java.

- Ghi đè phương thức được sử dụng để thu được tính đa hình tại runtime.

- Nguyên tắc ghi đè phương thức:

    - Phương thức phải có tên giống với lớp cha.
    - Phương thức phải có tham số giống với lớp cha.
    - Lớp con và lớp cha có mối quan hệ kế thừa.
```java
public class Bike {
    public void run() {
        System.out.println("running");
    }
}
 
public class Splender extends Bike {
    public void run() {
        System.out.println("running safely with 60km");
    }
 
    public static void main(String args[]) {
        Bike b = new Splender(); // upcasting 
        b.run();
    }
}
```
Output:
> running safely with 60km

- Không ghi đè được phương thức static: Vì phương thức static được ràng buộc với class, còn phương thức instance được ràng buộc với đối tượng. Static thuộc về vùng nhớ class còn instance thuộc về vùng nhớ heap.

### Khác nhau giữa Overloading và Overriding

| Nạp chồng phương thức                                                                                                                                                 | Ghi đè phương thức                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| Nạp chồng phương thức được sử dụng để tăng tính có thể đọc của chương trình                                                                                           | Ghi đè phương thức được sử dụng để cung cấp trình triển khai cụ thể của phương thức mà đã được cung cấp bởi lớp cha của nó |
| Nạp chồng phương thức được thực hiện bên trong lớp (class)                                                                                                            | Ghi đè phương thức xuất hiện trong hai lớp mà có mối quan hệ IS-A (kế thừa)                                                |
| Trong Nạp chồng phương thức, tham số phải khác nhau                                                                                                                   | Trong Ghi đè phương thức, tham số phải là giống nhau                                                                       |
| Nạp chồng phương thức là ví dụ của đa hình tại biên dịch (compile)                                                                                                    | tại biên dịch (compile)	Ghi đè phương thức là ví dụ của đa hình tại thực thi (runtime)                                     |
| Không thể được thực hiện bởi thay đổi kiểu trả về của phương thức. Kiểu trả về có thể là giống hoặc khác trong Nạp chồng phương thức. Nhưng bạn phải thay đổi tham số | Kiểu trả về phải là giống                                                                                                  |
