# [JAVA] - BUỔI 8 
# MỘT SỐ CẤU TRÚC DỮ LIỆU THƯỜNG THẤY TRONG JAVA

```
Nội dung:
Cấu trúc dữ liệu là gì, sử dụng khi nào?
Interface Iterable, Collection -> List, Set, Queue.
Interface Map, SortedMap -> HashMap, TreeMap.
Sử dụng một số hàm của cấu trúc dữ liệu như sort.
```
## I. Cấu trúc dữ liệu
> Thuật ngữ cấu trúc dữ liệu đề cập đến một tập hợp dữ liệu với các hoạt động và hành vi hoặc thuộc tính được xác định rõ ràng. 
- Phân loại:
  - Cấu trúc dữ liệu tuyến tính: Trong cấu trúc dữ liệu tuyến tính, tất cả các phần tử được sắp xếp theo thứ tự tuyến tính hoặc tuần tự. Cấu trúc dữ liệu tuyến tính là cấu trúc dữ liệu mức đơn.
  - Cấu trúc dữ liệu phi tuyến tính: Cấu trúc dữ liệu phi tuyến tính không sắp xếp dữ liệu theo cách tuần tự như trong cấu trúc dữ liệu tuyến tính. Cấu trúc dữ liệu phi tuyến tính là cấu trúc dữ liệu đa cấp.
![Phân loại cấu trúc dữ liệu trong Java](image.png)
### Tại sao cần dùng cấu trúc dữ liệu
- Khi lượng dữ liệu phát triển nhanh chóng, các ứng dụng trở nên phức tạp hơn và có thể phát sinh các vấn đề sau:
  - Tốc độ xử lý: Do dữ liệu đang tăng lên từng ngày, nên cần phải xử lý tốc độ cao để xử lý lượng dữ liệu khổng lồ này, nhưng bộ xử lý có thể không xử lý được lượng dữ liệu nhiều đó.
  - Tìm kiếm dữ liệu: Hãy xem xét một kho có kích thước 200 mặt hàng. Nếu ứng dụng của cần tìm kiếm một mục cụ thể, nó cần phải duyệt qua 200 mục trong mỗi lần tìm kiếm. Điều này dẫn đến làm chậm quá trình tìm kiếm.
  - Nhiều yêu cầu cùng một lúc: Giả sử, hàng triệu người dùng đang đồng thời tìm kiếm dữ liệu trên một máy chủ web, thì có khả năng máy chủ bị lỗi.
- Để giải quyết các vấn đề trên, chúng ta sử dụng cấu trúc dữ liệu. Cấu trúc dữ liệu lưu trữ và quản lý dữ liệu theo cách mà dữ liệu cần thiết có thể được tìm kiếm ngay lập tức.
## II. Interface Iterable, Collection
### 1. Interface Iterable
- Trong Java, Iterable là một giao diện (interface) được định nghĩa trong gói `java.lang`. Nó liên quan đến việc duyệt qua các phần tử trong một tập hợp dữ liệu (collection) như mảng, danh sách liên kết, hoặc tập hợp (Set). Iterable cung cấp một cách tiếp cận trừu tượng để truy cập từng phần tử trong tập hợp, mà không cần biết chi tiết cài đặt của tập hợp đó.
- Giao diện này định nghĩa một phương thức duy nhất là `Iterator<T> iterator()`, nơi mà các lớp triển khai phải cung cấp một trình duyệt (iterator) để lặp qua các phần tử của tập hợp. 
- Ví dụ:
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> danhSach = new ArrayList<>();
        danhSach.add("Java");
        danhSach.add("Python");
        danhSach.add("C++");

        // Sử dụng Iterable và Iterator để duyệt qua danh sách liên kết
        Iterable<String> iterable = danhSach;
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String phanTu = iterator.next();
            System.out.println(phanTu);
        }
    }
}
```
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> danhSach = new ArrayList<>();
        danhSach.add("Java");
        danhSach.add("Python");
        danhSach.add("C++");

        // Sử dụng for-each loop để duyệt qua danh sách liên kết
        for (String phanTu : danhSach) {
            System.out.println(phanTu);
        }
    }
}
```
Kết quả:
```
Java
Python
C++
```
- Sử dụng Iterable và Iterator giúp cho việc duyệt qua các phần tử trong tập hợp dễ dàng và trừu tượng hơn, giúp tăng tính linh hoạt và tái sử dụng trong việc xử lý dữ liệu trong Java.
![](https://scaler.com/topics/images/iterators.webp)
### 2. Interface Collection
- Collection trong Java là một root interface trong hệ thống cấp bậc Collection. Java Collection cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).
![](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)
#### List
- Là một collection có thứ tự. List có thể chứa các phần tử trùng lặp. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng).
- Các phương thức của interface List trong Java bao gồm add, addAll, get, set, remove, clear, contains, isEmpty, size, subList, ...
- Các lớp cài đặt của List trong Java bao gồm
  - ArrayList
  - LinkedList
  - Stack
  - Vector.
- Ví dụ:
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Cat");
        list.add("Dog");
        list.add(1, "Fish");
        list.add("Dog");
        System.out.println(list.size()); // 4
        System.out.println(list); // [Cat, Fish, Dog, Dog]
    }
}
```
#### Set
- Là một collection không thể chứa 2 giá trị trùng lặp.
- Các lớp cài đặt của Set gồm:
  - HashSet lưu trữ các phần tử của nó trong bảng băm, là cách thực hiện tốt nhất, tuy nhiên nó không đảm bảo về thứ tự các phần tử được chèn vào.
  - TreeSet lưu trữ các phần tử của nó trong một cây, sắp xếp các phần tử của nó dựa trên các giá trị của chúng, về cơ bản là chậm hơn HashSet.
  - LinkedHashSet được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, sắp xếp các phần tử của nó dựa trên thứ tự chúng được chèn vào tập hợp (thứ tự chèn).
  - EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum.
- Các phương thức: add, addAll, remove, clear, contains, isEmpty, size, ...
- Ví dụ:
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Fish");
        set.add("Dog");
        System.out.println(set.size()); // 3
        System.out.println(set.contains("Fish")); // true
        System.out.println(set); // [Cat, Fish, Dog]
    }
}
```
#### Queue
- Trong hàng đợi (trong Queue), các phần tử được lưu trữ và truy cập theo cách nhập trước, xuất trước (FIFO - First In First Out)
- Các lớp cài đặt của Queue bao gồm:
  - ArrayDeque
  - LinkedList
  - PriorityQueue
- Một số phương thức thường được sử dụng của Queue:
  - add(): Chèn phần tử đã chỉ định vào hàng đợi.
  - peek() - Trả về đầu của hàng đợi. Trả về null nếu hàng đợi trống.
  - poll() - Trả về và loại bỏ phần đầu của hàng đợi
## III. Interface Map, SortedMap
### Map
- Được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp key và value. Mỗi cặp key và value được gọi là mục nhập (entry). Map trong java chỉ chứa các giá trị key duy nhất. Map rất hữu ích nếu bạn phải tìm kiếm, cập nhật hoặc xóa các phần tử trên dựa vào các key.
- Các lớp cài đặt của Map:
  - HashMap
  - LinkedHashMap
  - HashTable
  - TreeMap
- Một số phương thức: get(), put(), remove(), keySet(),...
- Ví dụ:
```
public class MapExample {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
```
#### Hash Map
- Lớp HashMap trong Java là một lớp triển khai của Map Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Map.
- Một số đặc điểm:
  - HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
  - Chứa các key duy nhất.
  - Có thể có 1 key là null và nhiều giá trị null.
Duy trì các phần tử KHÔNG theo thứ tự.
### SortedMap và Tree Map
- SortedMap: là một Map chứa các phần tử được sắp xếp theo thứ tự tăng dần của key của chúng. Các SortedMap được sử dụng cho các collection theo thứ tự tự nhiên của cặp key/value, chẳng hạn như từ điển và danh bạ điện thoại.
- Lớp TreeMap: là một lớp triển khai của SortedMap, SortedMap kế thừa Map interface. Nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Map và SortedMap.
- Một số đặc điểm:
  - TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
  - Chứa các key duy nhất.
  - KHÔNG cho phép bất kỳ key nào là null và nhưng có thể có nhiều giá trị null.
  - Duy trì các phần tử được thêm vào theo thứ tự key tăng dần.
## IV. Hàm sort
> Lớp Collections trong java cung cấp các phương thức static để sắp xếp các phần tử của collection. Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap. Collections cung cấp phương thức sort() để phân sắp xếp các phần tử.
- Phương thức Collections.sort(List): được sử dụng để sắp xếp các phần tử của List. Với điều kiện các phần tử của List phải là kiểu Comparable. Nghĩa là lớp các phần tử phải được implements giao diện Comparable
  - Lớp String và các lớp Wrapper được implements giao diện Comparable => Có thể áp dụng phương thức Collections.sort(List list) mà không phải cài đặt gì thêm.
  - Còn đối với List của các đối tượng do người dùng tự định nghĩa thì phải implements giao diện Comparable cho lớp của đối tượng đó.
- Ví dụ:
```
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(9);
        list.add(22);
        System.out.println(list); // [11, 5, 9, 22]
        Collections.sort(list);
        System.out.println(list); // [5, 9, 11, 22]
    }
}
```
- Đối với String và các lớp Wrapper, mặc định là sắp xếp tăng dần
  - Sắp xếp giảm dần: Sử dụng phương thức `Collections.sort(list, new Comparator<T>())`
- Ví dụ:
```
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(20);
        System.out.println(list); // [10, 5, 9, 20]
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 0;
            }
        });
        System.out.println(list); // [5, 9, 10, 20]
    }
}
```
- Đối với các đối tượng người dùng tự định nghĩa: phải implements giao diện java.lang.Comparable để cài đặt phương thức compareTo()
- Ví dụ:
```
public class SinhVien implements Comparable<SinhVien> {
    private String name, msv;
    private double gpa;

    public SinhVien(String name, String msv, double gpa) {
        this.name = name;
        this.msv = msv;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getName().compareTo(o.getName());
    }
    //getter & setter
}
public class Main {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("AB", "001", 3.2));
        list.add(new SinhVien("AAA", "003", 3.0));
        list.add(new SinhVien("BCB", "002", 2.0));
        Collections.sort(list);
        for(SinhVien sinhVien : list){
            System.out.println(sinhVien.getName()); // AAA AB BCB
        }
    }
}
```
