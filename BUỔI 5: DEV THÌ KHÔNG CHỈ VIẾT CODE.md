# [JAVA] - BUỔI 5 
# DEV THÌ KHÔNG CHỈ VIẾT CODE

## I. Version Control
- Version Control, còn được gọi là Source Control, là hoạt động theo dõi và quản lý các thay đổi đối với mã phần mềm. 
- Version Control Systems (VCS) là các công cụ phần mềm giúp nhóm phần mềm quản lý các thay đổi đối với mã nguồn theo thời gian.
- Như tên gọi, hệ thống sẽ ghi lại những thay đổi được thực hiện đối với một tệp hoặc một tập hợp tệp. Hệ thống ghi lại tất cả các thay đổi đã thực hiện đối với một tệp để có thể tung ra một phiên bản cụ thể nếu cần trong tương lai.

### Tại sao cần dùng Version Control
- Quản lý và bảo vệ Source Code
- Theo dõi tất cả các sửa đổi được thực hiện đối với Code
- So sánh các phiên bản trước của Code
- Hỗ trợ quy trình làm việc (Developers’ Workflow) của Dev

## II. Khái niệm về Git
> Git là một hệ thống VCS (Version Control System) 

- Các hệ thống quản lý phiên bản khác như: Subversion, Perforce, Bazaar,... coi thông tin được lưu trữ như là một tập hợp các tập tin và các thay đổi được thực hiện trên mỗi tập tin theo thời gian, được minh hoạ trong hình dưới đây:

![Subversion, Perforce, Bazaar,... thao tác với dữ liệu](https://images.viblo.asia/e79d6e7c-0618-4c40-83a7-3b46a4cfb90d.png)

- Git coi dữ liệu của nó giống như một tập hợp các "ảnh" (snapshot) của một hệ thống tập tin nhỏ. Mỗi lần bạn "commit", hoặc lưu lại trạng thái hiện tại của dự án trong Git, về cơ bản Git "chụp một bức ảnh" ghi lại nội dung của tất cả các tập tin tại thời điểm đó và tạo ra một tham chiếu tới "ảnh" đó. 
- Để hiệu quả hơn, nếu như tập tin không có sự thay đổi nào, Git không lưu trữ tập tin đó lại một lần nữa mà chỉ tạo một liên kết tới tập tin gốc đã tồn tại trước đó. Git thao tác với dữ liệu giống như hình dưới đây:

![Git thao tác với dữ liệu](https://images.viblo.asia/3f824be4-857c-483b-8724-a169be3a96ba.png)

### Repository
- Repository được hiểu là một kho lưu trữ nơi chứa các files của dự án. Các file đó có thể là code, hình ảnh, âm thanh hoặc mọi thứ liên quan đến dự án. Có thể tổ chức kho lưu trữ của mình dưới nhiều hình thức khác nhau.
  - Local Repository: là một loại repository nằm trên máy tính của bạn, repository này có nhiêm vụ đồng bộ hóa với remote repository bằng các lệnh của git.
  - Remote Repository: là một loại repository được cài đặt trên server chuyên dụng. Ví dụ như: GitHub, GitLab, Bitbucket,…

![enter image description here](https://wiki.tino.org/wp-content/uploads/2021/05/word-image-215.png)

### Branch
- Branch được dùng để phân nhánh và ghi luồng của lịch sử. Có thể dùng Branch để triển khai dự án theo hướng cô lập để không ảnh hưởng đến dự án chính. Tại đây cho phép bạn thử nghiệm các tính năng mới hoặc điều chỉnh, sửa lỗi project.

- Khi khởi tạo kho lưu trữ hoặc Clone, các thành viên sẽ được tạo lập một branch dùng riêng cho công việc của mình từ branch chính để không làm ảnh hưởng đến công việc của những thành viên khác. Branch riêng này sẽ chứa toàn bộ mã nguồn trong kho.

- Sau khi công việc đã hoàn thành, bạn có thể nhập branch vừa tạo vào những branch khác khoặc repository chính bằng cách dùng lệnh Pull Request.

![enter image description here](https://wiki.tino.org/wp-content/uploads/2021/05/word-image-219.png)
### Pull Request
- Pull Request là lệnh được dùng để thông báo với mọi người rằng bạn đã đẩy những thay đổi của Branch lên Repository tổng. Khi đó, các thành viên khác có thể chấp nhận hoặc từ chối Request này. 
### Commit
- Commit là thao tác có chức năng ghi lại những thay đổi file hay thư mục vào kho lưu trữ, những thay đổi này sẽ được lưu vào thư mục commit trong kho và được sắp xếp theo thứ tự thời gian chỉnh. Do đó khi nhìn vào thư mục commit bạn sẽ biết lịch sử chỉnh sửa/thay đổi các file hoặc thư mục. 
- Mỗi commit đều cần phải có commit message với nhiệm vụ ghi nhận sự thay đổi theo tiến trình update của lập trình viên.
### Merge
- Được dùng khi ta muốn gộp hai branch lại với nhau, thao tác này thường dùng để merge branch khác vào branch chính trước khi push lên remote repository, hoặc merge hai branch thành một để giải quyết chung một task.
> Lệnh:
```
$ git merge <branch_name>

$ git merge <branch-name> <merged-branch-name>
```
### Pull
- Lệnh dùng để tải xuống dữ liệu từ một Remote repository và cập nhật Local repository phù hợp với dữ liệu đó. Nói cách khác, Git Pull là lệnh hợp nhất các thay đổi từ Remote repository vào Local repository.
> Lệnh:
```
$ git pull origin master
```
### Push
- Lệnh được sử dụng để đẩy các commit mới ở Local repository lên Remote repository(server).
> Lệnh:
```
$ git push origin <name_branch>
```
- Nếu chưa tồn tại remote trên server thì bạn cần phải add mới một remote trước rồi mới push.
> Lệnh:
```
$ git remote add origin <remote_url>

$ git push origin <name_branch>
```
### Fork Repository
- Khái niệm này được hiểu là hành động tạo một dự án mới dựa trên dự án đã có sẵn. Cho phép bạn sao chép hoàn toàn một repository cũ, sau đó thay đổi hoặc chỉnh sửa một vài thứ cần thiết và lưu phiên bản mới này dưới dạng một repository độc lập hoàn toàn mới và gọi nó là dự án của riêng bạn.

- Đây là tính năng giúp đẩy nhanh tiến độ của dự án. Vì là một dự án mới nên repository cũ không ảnh hưởng. Khi repository tổng được cập nhật, bạn cũng có thể áp dụng các cập nhật đó lên bản fork của bạn.
### Clone
- Với tính năng gần giống như Fork, Clone cho phép tạo ra bản sao dữ liệu hoàn chỉnh của kho đang được lưu chứa trên máy chủ và tất cả lịch sử trên kho. Với Clone, bạn có thể phục hồi bất kỳ bước nào dù đã commit. Đặc biệt, dù ổ cứng máy chủ có bị hư hỏng và không sử dụng được, bạn vẫn có thể sử dụng Clone của máy khách bất kỳ để khôi phục lại dữ liệu máy chủ.
> Lệnh:
```
$ git clone path-git
```
## III. Pull Request
- Thực tế khi làm việc trong team có nhiều người, mỗi một chức năng bạn hoàn thành code và cần được team review, bạn không thể gọi mọi người đến máy tính của bạn và ngồi đấy review từng dòng code cho bạn. Bạn cũng không thể gửi từng file source code cho người review để họ download về máy và review được - quá tốn thời gian và thật sự không chuyên nghiệp. Và tất nhiên khi khách hàng (đang ở một nơi nào đấy rất rất xa bạn) muốn tham gia review code của bạn thì chuyện này càng khó khăn hơn. Đó là lúc cần dùng đến Pull Request.
- Khi một Pull Request được chấp nhận, các thay đổi được hợp nhất vào branch chính của dự án. Quá trình này có thể được tự động hóa bằng các công cụ tích hợp liên kết với hệ thống quản lý mã nguồn. Pull Request là một cách linh hoạt và an toàn để đóng góp vào dự án và đảm bảo rằng các thay đổi mới không gây ra tác động tiêu cực đến mã nguồn hiện có.
- Để tạo Pull Request, bạn hãy thực hiện theo các bước sau:
    - Chuyển tới Repository và tìm Menu Branch
    -Trong Menu, chọn Branch bạn vừa thay đổi.
    -Nhấn vào nút New Pull Request bên cạnh Menu Branch
    -Thêm tiêu đề và mô tả vào Pull Request của bạn
    -Nhấn nút Create Pull Request
## IV. UML
> Ngôn ngữ mô hình hóa thống nhất (tiếng Anh: Unified Modeling Language) là một ngôn ngữ mô hình gồm các ký hiệu đồ họa mà các phương pháp hướng đối tượng sử dụng để thiết kế các hệ thống thông tin một cách nhanh chóng.
- Cách xây dựng các mô hình trong UML phù hợp mô tả các hệ thống thông tin cả về cấu trúc cũng như hoạt động. 
- Cách tiếp cận theo mô hình của UML giúp ích rất nhiều cho những người thiết kế và thực hiện hệ thống thông tin cũng như những người sử dụng nó; tạo nên một cái nhìn bao quát và đầy đủ về hệ thống thông tin dự định xây dựng.
- Cách nhìn bao quát này giúp nắm bắt trọn vẹn các yêu cầu của người dùng; phục vụ từ giai đoạn phân tích đến việc thiết kế, thẩm định và kiểm tra sản phẩm ứng dụng công nghệ thông tin. 
### Lí do cần vẽ UML
- Có cái nhìn bao quát hệ thống và nắm bắt trọn vẹn yêu cầu của khách hàng.
- UML hỗ trợ việc thiết kế hệ thống bằng cách mô tả các lớp, đối tượng, mối quan hệ, và các phần tử khác của hệ thống. Cho phép nhóm phát triển hiểu cấu trúc và quan hệ giữa các thành phần của hệ thống.
- UML cung cấp một ngôn ngữ chung để giao tiếp giữa các thành viên trong nhóm phát triển, giúp họ hiểu rõ ý tưởng và thiết kế của nhau.
## V. Class Diagram & Activity Diagram
### 1. Class Diagram
> Class Diagram trong UML là một loại sơ đồ cấu trúc tĩnh mô tả cấu trúc của hệ thống bằng cách hiển thị các lớp của hệ thống, thuộc tính, hoạt động (hoặc phương thức) của chúng và mối quan hệ giữa các đối tượng.
 
![enter image description here](https://cdn-images.visual-paradigm.com/guide/uml/what-is-class-diagram/01-class-diagram-in-uml-diagram-hierarchy.png)
- Mục đích: 
  - Hiển thị cấu trúc tĩnh của các bộ phận trong một hệ thống
  - Thế hiện sự thống nhất giữa các thành phân view tĩnh.
  - Mô tả sự phản hồi của hệ thống.
  - Cơ sở cho các sơ đồ thành phần và triển khai.
- Một Class Diagram UML được tạo thành từ:
  - Một tập hợp các lớp và
  - Tập hợp các mối quan hệ giữa các lớp
##### Class Notation
- Gồm 3 phần:
  - Class Name: Tên của lớp xuất hiện trong phân vùng đầu tiên.
  - Class Attributes: Các thuộc tính được hiển thị trong phân vùng thứ hai.
Loại thuộc tính được hiển thị sau dấu hai chấm.
  - Class Operations (Methods): Các hoạt động được hiển thị trong phân vùng thứ ba. Chúng là những dịch vụ mà lớp cung cấp.
Kiểu trả về của một phương thức được hiển thị sau dấu hai chấm ở cuối chữ ký phương thức.
Kiểu trả về của các tham số phương thức được hiển thị sau dấu hai chấm theo sau tên tham số.

  ![enter image description here](https://cdn-images.visual-paradigm.com/guide/uml/what-is-class-diagram/02-simple-class.png)
##### Access Modifier trong Class Diagram
- Private ( – )
- Public ( + )
- Protected ( # )
- Package/ Default
##### Class Relationships
- Một lớp có thể tham gia vào một hoặc nhiều mối quan hệ với các lớp khác.

  ![Class Relationships](https://images.viblo.asia/c869cd68-1172-4a51-8257-81c732537bae.PNG)

- Inheritance: 1 class kế thừa từ 1 class khác.
- Association: 2 class có liên hệ với nhau nhưng không chỉ rõ mối liên hệ.
- Composition: Đối tượng tạo từ class A mất thì đối tượng tạo từ class B sẽ mất.
- Agreegation: Đối tượng tạo từ lass A mất thì đối tượng tạo từ class B vẫn tồn tại độc lập. 
##### Multiplicity trong Class Diagram
- Sử dụng để thể hiện quan hệ về số lượng giữa các đối tượng được tạo từ các class trong class diagram
  - 0…1: 0 hoặc 1
  - n : Bắt buộc có n
  - 0…* : 0 hoặc nhiều
  - 1…* : 1 hoặc nhiều
  - m…n: có tối thiểu là m và tối đa là n
  
 ![](https://images.viblo.asia/91cafd9c-0266-4817-90f8-428fed42a708.PNG)

[Reference Material](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-class-diagram/)
### 2. Activity Diagram
> Là một sơ đồ hành vi quan trọng khác trong sơ đồ UML để mô tả các khía cạnh động của hệ thống. Sơ đồ hoạt động về cơ bản là phiên bản nâng cao của biểu đồ luồng mô hình hóa luồng từ hoạt động này sang hoạt động khác.

- Thành phần:
  - Start
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25205846/image001.png?resize=28%2C27&ssl=1)
    - Khởi tạo một hoạt động.
    - Một Activity Diagram có thể có nhiều trạng thái Start.   
  - Transition
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25205947/image002.png?resize=186%2C16&ssl=1)
    - Mô tả sự chuyển đổi trạng thái của các hoạt động.
  - Activity
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25205956/image003.png?resize=95%2C37&ssl=1)
    - Mô tả hành vi của đối tượng trong quy trình.
  - Decision
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210009/image004.png?resize=36%2C37&ssl=1)
    - Đây là kí hiệu biểu thị nút điều kiện chuyển hướng. Tùy theo trường hợp đúng hay sai của kết quả mà có hướng di chuyển tiếp theo tương ứng.
    - Decision bao gồm hai loại sau: Branch và Merge
  - Branch
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210023/image005.png?resize=207%2C128&ssl=1)
  - Merge
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210036/image006.png?resize=172%2C119&ssl=1)
  - Synchronization bar
    - Khi có các trường hợp cần hội tụ đủ nhiều luồng điều khiển một lúc để gộp thành một luồng xử lí thì cần dùng JOIN.
    - Khi cần phải tách một luồng điều khiển ra hai hoặc nhiều luồng khác biệt nhau thì cần dùng FORK. Mỗi luồng của FORK hoàn toàn không lệ thuộc nhau.
  - Join
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210134/image008-2.png?resize=159%2C82&ssl=1)
  - Fork
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210142/image009.png?resize=159%2C78&ssl=1)
  - End
    
  ![](https://i0.wp.com/s3.ap-southeast-1.amazonaws.com/techover.storage/wp-content/uploads/2021/08/25210153/image010.png?resize=34%2C29&ssl=1)
    - Mô tả trạng thái kết thúc quy trình.
    - Một Activity Diagram có thể có một hoặc nhiều trạng thái kết thúc.
