- Nhờ phần mềm tìm kiếm sách của mình, cửa hàng của Cường ngày càng đông khách hơn. Là một nhà kinh doanh đại tài, Cường muốn kinh doanh nhiều sản phẩm hơn để góp phần thu lãi.
- Cụ thể, anh ấy dự định kinh doanh bán thêm 3 sản phẩm mới, đó là vở ghi, bút chì và bút mực. Cụ thể chúng có các thông tin sau:
    - Vở ghi: Tên sản phẩm, giá bán, thương hiệu, số trang, loại vở (vở kẻ ô, vở kẻ ngang, vở kẻ caro), màu sắc bìa, chất liệu giấy (giấy trắng, giấy màu), kích thước (A4, A5, A6).
    - Bút chì: Tên sản phẩm, giá bán, thương hiệu, màu sắc, chất liệu (gỗ, nhựa), độ cứng (HB, 2B, 3B, 4B, 5B, 6B, 7B, 8B, 9B, 10B).
    - Bút mực: Tên sản phẩm, giá bán, thương hiệu, màu sắc, chất liệu (nhựa, kim loại), loại mực (mực dầu, mực nước), độ mịn (0.5mm, 0.7mm, 1mm, 1.5mm, 2mm, 2.5mm, 3mm, 3.5mm, 4mm, 4.5mm, 5mm).
    - Sách: Tên sản phẩm, giá bán, thể loại, tác giả, nhà xuất bản, năm xuất bản,  ngôn ngữ.
- Khách hàng vẫn có thể tìm kiếm sản phẩm như cũ, họ có thể nhập tên hoặc bất kì một thông số nào (ví dụ chất liệu giấy, loại mực, ...) để tìm kiếm sản phẩm. Sau đó hệ thống sẽ trả ra một danh sách các sản phẩm có vẻ tương đồng với thông số tìm kiếm trên (vở ghi, bút chì, bút mực, sách). 

- Ngoài ra, khi tìm kiếm, khách hàng có thể chọn thêm xem ở dạng bảng hay dạng danh sách. Mẫu một truy vấn như sau


- 1. Chọn chức năng tìm kiếm
- 2. Gõ tìm kiếm `đen`
- 3. Hệ thống hỏi muốn hiển thị kết quả dạng bảng hay danh sách
- 4.1 Chọn hiển thị dạng bảng

| Tên sản phẩm | Giá bán | Thương hiệu | Thông tin thêm |
| --- | --- | --- | --- |
| Bút chì | 5000 | Thiên Long | - Màu sắc: `Đen` <br> - Chất liệu: Gỗ <br> - Độ cứng: HB |
| Bút mực | 10000 | Thiên Long | - Màu sắc: `Đen` <br> - Chất liệu: Nhựa <br> - Loại mực: Mực dầu <br> - Độ mịn: 0.5mm |
| Sách Kí Ức `Đen` | 50000 | Kim Đồng | - Thể loại: Tiểu thuyết <br> - Tác giả: Nguyễn Nhật Ánh <br> - Nhà xuất bản: Kim Đồng <br> - Năm xuất bản: 2010 <br> - Ngôn ngữ: Tiếng Việt |
| Sách Đắc Nhân Vật | 100000 | NXB Trẻ | - Thể loại: Kỹ năng sống <br> - Tác giả: Dale Carnegie <br> - Nhà xuất bản: NXB Đồng `Đen` <br> - Năm xuất bản: 2010 <br> - Ngôn ngữ: Tiếng Việt |

- 4.2 Nếu chọn hiển thị dạng danh sách

```
Danh sách sản phẩm tìm kiếm được:
------
Tên sản phẩm: Bút chì
Giá bán: 5000
Thương hiệu: Thiên Long
Màu sắc: Đen
Chất liệu: Gỗ
Độ cứng: HB
------
Tên sản phẩm: Bút mực
Giá bán: 10000
Thương hiệu: Thiên Long
Màu sắc: Đen
Chất liệu: Nhựa
Loại mực: Mực dầu
Độ mịn: 0.5mm
------
Tên sản phẩm: Sách Kí Ức Đen
Giá bán: 50000
Thương hiệu: Kim Đồng
Thể loại: Tiểu thuyết
Tác giả: Nguyễn Nhật Ánh
Nhà xuất bản: Kim Đồng
Năm xuất bản: 2010
Ngôn ngữ: Tiếng Việt
------
Tên sản phẩm: Sách Đắc Nhân Vật
Giá bán: 100000
Thương hiệu: NXB Trẻ
Thể loại: Kỹ năng sống
Tác giả: Dale Carnegie
Nhà xuất bản: NXB Đồng Đen
Năm xuất bản: 2010
Ngôn ngữ: Tiếng Việt
------
```
