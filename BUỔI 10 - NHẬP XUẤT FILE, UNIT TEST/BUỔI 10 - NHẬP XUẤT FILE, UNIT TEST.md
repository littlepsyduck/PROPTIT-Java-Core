# [JAVA] - BUỔI 10
# NHẬP XUẤT FILE, UNIT TEST

```
Nội dung:
Xử lí File trong Java (Binary file, Text file)
Assertions
Unit test
Tầm quan trọng của việc viết Unit test
```
## I. Xử lí File trong Java
> Đọc và ghi file trong java là các hoạt động nhập/xuất dữ liệu (nhập dữ liệu từ bàn phím, đọc dữ liệu từ file, ghi dữ liệu lên màn hình, ghi ra file, ghi ra đĩa, ghi ra máy in…) đều được gọi là luồng (stream).
> 
![](https://giasutinhoc.vn/wp-content/uploads/2016/02/doc-va-ghi-file-trong-java-1.jpg)

### Các loại luồng dữ liệu:
 
|  Luồng byte | Luồng character  |
|---|---|
| Hỗ trợ việc xuất nhập dữ liệu trên byte  |  Hỗ trợ việc xuất nhập dữ liệu kiểu ký tự (Unicode)  |
| 2 abstract class: InputStream (đọc) và OutputStream (ghi)|  2 abstract class: Reader và Writer|

![](https://giasutinhoc.vn/wp-content/uploads/2016/02/doc-va-ghi-file-trong-java-3.jpg)

![](https://giasutinhoc.vn/wp-content/uploads/2016/02/doc-va-ghi-file-trong-java-4.jpg)

***Kiến trúc luồng nhập/ xuất dữ liệu.***

### Các thao tác xử lý dữ liệu

- Bước 1: Tạo đối tượng luồng và liên kết với nguồn dữ liệu.
- Bước 2: Thao tác dữ liệu (đọc hoặc ghi hoặc cả hai).
- Bước 3: Đóng luồng.

#### Xử lý nhập xuất dữ liệu sử dụng luồng byte
- Sử dụng luồng byte trong các trường hợp như nhập xuất kiểu dữ liệu nguyên thủy (như kiểu int, float, double, boolean), nhập xuất kiểu dữ liệu kiểu đối tượng (object).
- Lớp FileInputStream trong package java.io có thể được sử dụng để đọc dữ liệu (dạng byte) từ file. Lớp này kế thừa từ lớp abstract InputStream.
- Lớp FileOutputStream trong package java.io có thể được sử dụng để ghi dữ liệu (dạng byte) từ file. Lớp này kế thừa từ lớp abstract OutputStream.

```java
public class Test {
    public static void main(String[] args) throws IOException {

        String s = "Hello Python";

        FileOutputStream fos = new FileOutputStream("Test.bin");
        fos.write(s.getBytes(StandardCharsets.UTF_8));
        fos.close();

        FileInputStream fis = new FileInputStream("Test.bin");
        while(fis.available() !=0){
            System.out.print((char) fis.read());
        }
    }
}
```
#### Xử lý nhập xuất dữ liệu bằng luồng character
- Lớp FileWriter nằm trong package java.io được sử dụng để ghi dữ liệu là các ký tự (character) vào file. Lớp FileWriter kế thừa từ lớp OutputStreamWriter.
- Lớp FileReader nằm trong package java.io có thể được sử dụng để đọc dữ liệu là các ký tự (character) từ file. Lớp FileReader kế thừa từ lớp InputSreamReader.

```java
public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("Test.txt");
        FileWriter writer = new FileWriter(file);

        writer.write("Hello Java");
        writer.close();

        FileReader reader = new FileReader(file);
        while(reader.ready()){
            System.out.print((char) reader.read());
        }
        reader.close();
    }
}
```

## II. Assertion
- Assertion (mệnh đề khẳng định) trong Java được dùng để kiểm chứng những giả định về những điều kiện của chương trình. Nếu giả định là đúng, chương trình hoạt động bình thường, nếu không chương trình sẽ thả lỗi AssertionError và ngắt ngay lập tức. 
- Nó chủ yếu được sử dụng cho mục đích kiểm thử trong quá trình phát triển.
- Mặc định, assertions bị vô hiệu hóa. Chúng ta cần chạy mã như sau để kích hoạt lệnh:
  
  - Để kích hoạt: 
  `java –ea Test` hoặc `java –enableassertions Test`

  - Để vô hiệu hóa: 
  `java –da Test` hoặc `java –disableassertions Test`

- Lệnh assert được sử dụng với một biểu thức Boolean và có thể được viết theo hai cách1:
  - Cách thứ nhất: `assert expression;`
  - Cách thứ hai: `assert expression1 : expression2;`

```java
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int x = 1;

        assert x == 0;

        System.out.println("x=1");
    }
}
```

```
PS D:\Intellij\Test\src> java -ea Test2.java
Exception in thread "main" java.lang.AssertionError
        at Test2.main(Test2.java:9)
```

```java
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int x = 1;

        assert x == 0: "x != 1";

        System.out.println("x=1");
    }
}
```

```
PS D:\Intellij\Test\src> java -ea Test2.java
Exception in thread "main" java.lang.AssertionError: x != 1
        at Test2.main(Test2.java:9)
```

## III. Unit Test
- Unit test là mức độ kiểm thử nhỏ nhất trong quy trình kiểm thử phần mềm. Unit test kiểm thử các đơn vị nhỏ nhất trong mã nguồn như method, class, module… Mục tiêu của Unit test là cô lập một phần code và xác minh tính chính xác của đơn vị đó.
- Tại sao phải sử dụng Unit Test:
  - Tạo ra môi trường lý tưởng để kiểm tra bất kỳ đoạn code nào, có khả năng thăm dò và phát hiện lỗi chính xác, duy trì sự ổn định của toàn bộ PM và giúp tiết kiệm thời gian so với công việc gỡ rối truyền thống.
  - Phát hiện các thuật toán thực thi không hiệu quả, các thủ tục chạy vượt quá giới hạn thời gian.
  - Phát hiện các vấn đề về thiết kế, xử lý hệ thống, thậm chí các mô hình thiết kế.
  - Phát hiện các lỗi nghiêm trọng có thể xảy ra trong những tình huống rất hẹp.
  - Tạo hàng rào an toàn cho các khối mã: Bất kỳ sự thay đổi nào cũng có thể tác động đến hàng rào này và thông báo những nguy hiểm tiềm tàng.

