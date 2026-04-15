# Driver-Safety-System-Java
Hệ thống cảnh báo rủi ro và hỗ trợ sức khỏe tâm lý cho tài xế công nghệ - Dự án thực tế cho sinh viên HACTECH.
# 🛡️ Driver Safety System (DSS) - Java Edition
> **Hệ thống cảnh báo rủi ro và hỗ trợ sức khỏe tâm lý cho tài xế công nghệ.**

## 📌 Tổng quan dự án
Dự án được khởi xướng dựa trên trải nghiệm thực tế của một tài xế Grab và sinh viên IT tại **HACTECH**. Mục tiêu là xây dựng một hệ thống từ con số 0 nhằm phân tích hành vi và bảo vệ an toàn cho những người tham gia nền kinh tế nền tảng (Gig Economy).

## 🚀 Tính năng chính (Dự kiến)
- **Real-time Monitoring:** Giám sát thời gian lái xe và tốc độ thông qua dữ liệu cảm biến.
- **Stress Detection:** Sử dụng AI để phân tích sự thay đổi trong cách lái xe nhằm dự đoán mức độ căng thẳng (Stress).
- **Smart Alert:** Gửi thông báo nhắc nhở nghỉ ngơi qua WebSocket khi phát hiện rủi ro cao.
- **Admin Dashboard:** Trang quản lý tổng quan cho các đơn vị vận hành.

## 🛠️ Công nghệ sử dụng
- **Backend:** Java 17, Spring Boot 3.x
- **Database:** MySQL (Lưu trữ dữ liệu lịch sử), Redis (Xử lý dữ liệu thời gian thực)
- **Security:** Spring Security & JWT
- **Communication:** WebSocket (Cập nhật cảnh báo tức thời)

## 🏗️ Kiến trúc hệ thống
Hệ thống được xây dựng theo mô hình **Client-Server**:
1. **Mobile Client (Android):** Thu thập dữ liệu GPS và cảm biến từ điện thoại tài xế.
2. **REST API Server:** Tiếp nhận và xử lý dữ liệu từ Client gửi về.
3. **Notification Engine:** Xử lý logic cảnh báo và đẩy thông báo xuống người dùng.

## 📂 Cấu trúc thư mục (Sơ lược)
```text
src/
 └── main/
      ├── java/com/dss/
      │    ├── controller/  # Nơi tiếp nhận các Request từ App
      │    ├── service/     # Nơi xử lý logic nghiệp vụ (Tính toán rủi ro)
      │    ├── repository/  # Nơi giao tiếp với Database
      │    └── model/       # Các đối tượng dữ liệu (Driver, Alert, Location)
      └── resources/        # File cấu hình (application.properties)
