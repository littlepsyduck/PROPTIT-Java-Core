# [JAVA] - BUỔI 3

# CÁCH JAVA LƯU TRỮ DỮ LIỆU

## 1. Cách Java lưu trữ dữ liệu
### Các vùng lưu trữ dữ liệu
- Khi một chương trình Java được thực thi, nó sẽ yêu cầu hệ điều hành cấp phát một không gian trên bộ nhớ để lưu trữ toàn bộ dữ liệu và thông tin của nó.
- Sau đó, nó sẽ chia vùng không gian đó thành 4 vùng nhớ (memory segment) để lưu trữ.

![](https://toithacmac.files.wordpress.com/2015/04/13.png?w=620)
- **Vùng nhớ code (code segment)**, theo như tên gọi của nó, tất cả mã chương trình (machine code) được lưu ở đây khi chương trình được thực thi.
- **Vùng nhớ data (data segment)**, đây là nơi lưu trữ những dữ liệu chung của chương trình như các biến static, constant,… những biến dữ liệu mà được sinh ra khi chương trình bắt đầu thực thi và chỉ được giải phóng khi chương trình kết thúc.
- **Vùng nhớ stack (stack segment)**, đây sẽ là nơi lưu trữ các biến thuộc nhóm kiểu dữ liệu cơ sở (primitive data type như là boolean, int, char,…) và địa chỉ của ô nhớ (memory address).
- **Vùng nhớ heap (heap segment)**, đây là nơi lưu trữ tất cả các đối tượng (object) được sinh ra trong thời gian thực thi chương trình (run time).

- Với vùng nhớ Code và Data, khi chương trình thực thi sẽ cấp phát một không gian có kích thước không đổi.
- Còn đối với vùng nhớ Stack và Heap, kích thước của nó sẽ thay đổi (hoặc mở rộng khi tạo thêm biến hoặc đối tượng, hoặc thu hẹp khi một biến hoặc đối tượng được giải phóng) và nếu cần mở rộng thêm, nó sẽ lấy không gian từ Free memory.

### Cách lưu dữ liệu
- **Kiểu dữ liệu nguyên thủy:** 
Tất cả các biến thuộc kiểu dữ liệu tham chiếu đều được lưu trên vùng nhớ stack.
```Java
 int a = 10; 
 ```
>Giải thích: int a là cấp phát một ô nhớ 4 byte (kiểu int có độ dài 4 byte) trên vùng nhớ stack. 
>Ô nhớ gồm có Value và địa chỉ.
>A = 10 gán value cho ô nhớ là 10.
- **Kiểu dữ liệu tham chiếu** 
Những biến thuộc kiểu dữ liệu tham chiếu (hay biến tham chiếu) sẽ được lưu tại vùng nhớ stack và đối tượng sinh ra (sau toán tử new) sẽ được lưu tại vùng nhớ heap. Giá trị của biến tham chiếu chính là địa chỉ của đối tượng được sinh ra đó. (Biến được lưu tại vùng nhớ stack, giá trị là địa chỉ của một đối tượng được lưu tại vùng nhớ heap).

```Java
String a = newString(“Java”);
```
> Đầu tiên là String a: Cấp phát một ô nhớ trên vùng nhớ stack, ô nhớ này chính là biến tham chiếu a.
>newString(): Cấp phát một ô nhớ trên vùng nhớ heap, ô nhớ này là một đối tượng kiểu String, việc cấp ô nhớ này do toán tử new thực hiện.
>String(“Java”): Gán giá trị “Java” cho ô nhớ trên vùng nhớ heap.
>a = new String(“Java”): Gán địa chỉ của đối tượng trên vùng nhớ heap cho value của ô nhớ trên vùng nhớ stack (biến tham chiếu a).

### Class Object
- Xuât hiện trong java.lang package. Mọi lớp trong Java đều có nguồn gốc trực tiếp hoặc gián tiếp từ Class Object. Do đó, Class Object đóng vai trò là gốc của hệ thống phân cấp kế thừa trong bất kỳ Chương trình Java nào. 
- Các phương thức của lớp object

![](https://media.geeksforgeeks.org/wp-content/uploads/20220915162018/Objectclassinjava.png)

```java
public final Class getClass() 
```
>Trả về đối tượng lớp Class của đối tượng hiện tại. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.
```Java
public int hashCode(): 
``` 
>Trả về số hashcode cho đối tượng hiện tại.
```Java
public boolean equals(Object obj)
```
>So sánh đối tượng đã cho với đối tượng hiện tại.

```java
public String toString()
```
>Trả về chuỗi ký tự đại diện của đối tượng hiện tại.
### Wrapper, boxing, unboxing
- Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy.
- Việc chuyển đổi một kiểu nguyên thủy sang kiểu Wrapper của nó người ta gọi là Boxing (đóng hộp).
- Có thể thực hiện việc boxing thông qua các phương thức khởi tạo của các lớp Wrapper:

```Java
// Các dạng Boxing
int a = 500;
Integer i = new Integer(a);
Integer j = new Integer(500);
Float f = new Float(4.5);
Double d = new Double(5);
Character ch = new Character('a');
Boolean b = new Boolean(true);

```
- Hoặc có thể gán trực tiếp các giá trị nguyên thủy vào cho các lớp Wrapper, cách này người ta còn gọi là Autoboxing, có nghĩa là hệ thống sẽ chuyển đổi một cách tự động.

```java
// Các dạng Autoboxing
int a = 500;
Integer i = a;
Integer j = 500;
Float f = 4.5f;
Double d = 5d;
Character ch = 'a';
Boolean b = true;
```
- Ngược lại với trên kia, khi bạn chuyển từ một kiểu Wrapper sang kiểu nguyên thủy của nó người ta gọi là Unboxing, có nghĩa là mở hộp, tức là mở cái hộp Wrapper để lấy dữ liệu nguyên thủy ra.
- Có thể thực hiện việc unboxing thông qua các phương thức xxxValue(). Với xxx là đại diện cho từng loại dữ liệu:

```java
int a = 500;
Integer i = a; // Autoboxing
int i2 = i.intValue(); // Unboxing
         
Integer j = 500; // Autoboxing
int j2 = j.intValue(); // Unboxing
         
Float f = 4.5f; // Autoboxing
float f2 = f.floatValue(); // Unboxing
         
Double d = 5d; // Autoboxing
double d2 = d.doubleValue(); // Unboxing
         
Character ch = 'a'; // Autoboxing
char ch2 = ch.charValue(); // Unboxing
         
Boolean b = true; // Autoboxing
boolean b2 = b.booleanValue(); // Unboxing
```
```java
int a = 500;
Integer i = a;
int i2 = i; // Unboxing
         
Integer j = 500;
int j2 = j; // Unboxing
         
Float f = 4.5f;
float f2 = f; // Unboxing
         
Double d = 5d;
double d2 = d; // Unboxing
         
Character ch = 'a';
char ch2 = ch; // Unboxing
         
Boolean b = true;
boolean b2 = b; // Unboxing
```
## 2. Các phương thức khởi tạo trong Java
### Hàm khởi tạo (constructor):
- Hàm khởi tạo (constructor) trong Java là một hàm có tên giống với tên lớp. Hàm này được gọi khi khởi tạo đối tượng. Hàm khởi tạo không có kiểu trả về. 
```java
public class Circle {  
    private int radius;
    private String color;
    public Circle(){                   
    	radius = 2;
    	color = "blue";
    }
 }
```
Có 3 loại hàm khởi tạo trong Java:
- Hàm khởi tạo mặc định: được Java tự động tạo ra nếu bạn không định nghĩa bất kỳ constructor nào trong lớp. Default constructor sẽ khởi tạo các trường dữ liệu của lớp với giá trị mặc định (số nguyên là 0, số thực là 0.0, boolean là false, đối tượng là null).
- Hàm khởi tạo không tham số
```java
public class Animal {
    private String name;
    private int age;
    public Animal() {
        this.name = “”;
        this.age = 0;
    }
}
```
- Hàm khởi tạo có tham số: là constructor có tham số được định nghĩa để khởi tạo đối tượng với các giá trị được truyền vào. Được sử dụng khi cần truyền vào các giá trị cụ thể để khởi tạo đối tượng.
```java
public class Person {
    private String name;
    private int age;
   	public Person(String name, int age) {
       	this.name = name;
        this.age = age;
    }
}
```
### Constructor overloading: 
- Constructor overloading trong Java là kỹ thuật cho phép chúng ta tạo nhiều hơn một constructor trong cùng một lớp, nhưng mỗi constructor có thể có các tham số khác nhau. Khi tạo đối tượng của lớp đó, chúng ta có thể sử dụng bất kỳ constructor nào phù hợp với nhu cầu của chương trình.
```java
public class Student {    
    String name;
   	int age;
    String gender;
    String address;
    double gpa;  
   	// Constructor với thông tin cơ bản
    public Student(String name, int age, String gender, String address) {
       	this.name = name;
       	this.age = age;
        this.gender = gender;
        this.address = address;
    }   
    // Constructor với tất cả thông tin
    public Student(String name, int age, String gender, String address, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.gpa = gpa;
    }
    // Getter and setter methods for all attributes
    // …
}
```
### Copy Constructor:
- Copy constructor trong Java là một constructor đặc biệt được sử dụng để tạo ra một đối tượng mới là bản sao của một đối tượng đã tồn tại. Copy constructor thường được định nghĩa bằng cách sử dụng từ khóa “this” để trỏ đến đối tượng mới được tạo ra và sử dụng từ khóa “other” để trỏ đến đối tượng cần sao chép.
```java
public class Car {
    private String model;
    private int year;
    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    // Copy constructor
    public Car(Car otherCar) {
        this.model = otherCar.model;
        this.year = otherCar.year;
    }
    // Getters and setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Car với model là “BMW” và năm sản xuất là 2021
        Car car1 = new Car(“BMW”, 2021);
        // Sử dụng copy constructor để tạo một đối tượng Car mới từ car1
        Car car2 = new Car(car1);
        // Thay đổi model và năm sản xuất của car2
        car2.setModel(“Mercedes”);
        car2.setYear(2022);
        // In ra model và năm sản xuất của cả hai xe
        System.out.println(“Car 1: ” + car1.getModel() + “, ” + car1.getYear());
        System.out.println(“Car 2: ” + car2.getModel() + “, ” + car2.getYear());
    }
}
```
Output:
>Car 1: BMW, 2021
>Car 2: Mercedes, 2022
### Constructor chaining:
- Trong Java, một lớp có thể có nhiều hơn một constructor. Khi một đối tượng được khởi tạo, một trong các constructor sẽ được gọi để khởi tạo đối tượng đó. Constructor chaining là cơ chế cho phép gọi một constructor khác trong cùng lớp hoặc lớp cha của nó, thay vì viết lại các đoạn mã khởi tạo lại thuộc tính của lớp.
- Constructor chaining gồm 2 loại:

*Gọi constructor trong cùng lớp*
Trong trường hợp này, từ khóa “this” được sử dụng để gọi constructor khác trong cùng lớp. Constructor gọi đến sẽ được thực thi trước constructor gọi nó.
```java
public class Car {
    private String brand;
    private String model;
    private int year;
    public Car() {
        this(“Unknown”, “Unknown”, 0);
    }
    public Car(String brand) {
        this(brand, “Unknown”, 0);
    }
    public Car(String brand, String model) {
        this(brand, model, 0);
    }
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
```
>Trong ví dụ, Constructor đầu tiên không có tham số và gọi constructor thứ hai bằng từ khóa “this”. Constructor thứ hai lại gọi constructor thứ ba và constructor thứ ba lại gọi constructor thứ tư để khởi tạo các thuộc tính của lớp. Khi một đối tượng Car được khởi tạo, constructor đầu tiên sẽ được gọi và đến constructor thứ tư để khởi tạo các thuộc tính của lớp Car.

*Gọi constructor của lớp cha*
Trong trường hợp này, từ khóa “super” được sử dụng để gọi constructor của lớp cha. Constructor của lớp cha sẽ được thực thi trước constructor của lớp con. 
```java
public class Animal {
    private String name;
    private int age;
    public Animal(String name) {
        this.name = name;
    }
}
public class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
```
>Trong ví dụ, Constructor của lớp con Dog gọi constructor của lớp cha Animal bằng từ khóa “super”. Constructor của lớp cha sẽ được thực thi trước constructor của lớp con để khởi tạo thuộc tính “name” của lớp cha, sau đó constructor của lớp con sẽ được thực thi để khởi tạo thuộc tính “breed” của lớp con.

## 3. Garbage Collector
Garbage Collectors được định nghĩa như là một quá trình tự động thực thi nhiệm vụ quản lý bộ nhớ. Code Java được dịch sang bytecode rồi chạy trên máy ảo Java hay viết tắt là JVM. Trong quá trình chạy chương trình, các đối tượng được tạo ở vùng nhớ heap, một phần bộ nhớ dành cho chương trình. Sau cùng, sẽ có một vài đối tượng mà chương trình không cần dùng đến. Các đối tượng này sẽ được garbage collector truy tìm và xóa bỏ để thu hồi lại dung lượng bộ nhớ.
## 4. Pass by value
- Nếu chúng ta gọi 1 phương thức và truyền giá trị cho một giá trị cho phương thức đó được gọi là truyền giá trị (Pass by value).
- Việc thay đổi giá trị chỉ có hiệu lực trong phương thức được gọi, không có hiệu lực bên ngoài phương thức.
```Java
public class Operation1 {
    int data = 50;
    void change(int data) {
        data = data + 50;
    }
    public static void main(String args[]) {
        Operation1 op1 = new Operation1();
        System.out.println("Trước khi thay đổi: " + op1.data);
    	op.change(100);
        System.out.println("Sau khi thay đổi: " + op1.data);
    }
}
```
Output:
>Trước khi thay đổi: 50
>Sau khi thay đổi: 50
