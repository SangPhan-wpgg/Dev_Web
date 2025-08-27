BÀI TẬP 1: LOGIN (COOKIES VÀ SESSION)
MỤC TIÊU: 
Thực hiện việc demo cơ bản đối với Cookies và Session. Trong đó: đăng nhập vào bằng username và password được đặt cố định. 
	+ Phần Cookies: Login
	+ Phần Session: Login và Logout
THÔNG TIN ĐĂNG NHẬP:
- Username: noname123
- Password: noname@nameno

HelloWorld/
├── .settings/
├── .classpath
├── .project
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── vn/
│   │   │       ├── iotstar/
│   │   │       │   ├── controllers/
│   │   │       │   │   ├── HelloControllers.java
│   │   │       │   │   ├── HelloSerlvet.java
│   │   │       │   │   ├── LoginSerlvet.java
│   │   │       │   │   ├── LoginSerlvetSession.java
│   │   │       │   │   ├── Logout.java
│   │   │       │   │   └── Profile.java
│   │   │       │   └── models/
│   │   │       │       └── (các file model của bạn)
│   │   └── webapp/
│   │       ├── views/
│   │       │   ├── Login.html
│   │       │   └── LoginSession.html
│   │       └── WEB-INF/
│   │           └── web.xml 
│   └── test/
│       └── java/
│           └── (các file test)
├── target/
└── pom.xml

GIỚI THIỆU CHỨC NĂNG:
1. Chức năng đăng nhập bằng Cookies:
Chức năng này sử dụng Cookie để duy trì trạng thái đăng nhập.
• Login.html: Cung cấp giao diện đăng nhập trực quan, nơi người dùng nhập thông tin tài khoản của họ.
• LoginServlet.java: Sau khi người dùng gửi thông tin, servlet này sẽ xử lý và xác thực dữ liệu. Nếu đăng nhập thành công, một Cookie chứa thông tin định danh của người dùng sẽ được tạo và gửi đến trình duyệt, giúp duy trì phiên làm việc cho các lần truy cập tiếp theo.
• HelloServlet.java: Đóng vai trò là trang chào mừng. Servlet này sẽ đọc Cookie từ yêu cầu HTTP để xác thực người dùng. Nếu cookie hợp lệ, người dùng sẽ được chuyển hướng đến trang chào mừng cá nhân hóa.

2. Chức năng đăng nhập bằng Session:
Phương pháp này quản lý trạng thái đăng nhập bằng Session được lưu trữ trên máy chủ.
• LoginSession.html: Giao diện đăng nhập được thiết kế riêng cho luồng xử lý bằng Session.
• LoginServletSession.java: Sau khi xác thực thông tin đăng nhập thành công, servlet này sẽ tạo một Session trên máy chủ. Thông tin của người dùng sẽ được lưu trữ trong session này, và một ID session duy nhất sẽ được gửi về trình duyệt.
• Profile.java: Đây là một trang yêu cầu bảo mật. Để truy cập trang thông tin cá nhân này, người dùng phải có một Session hợp lệ trên máy chủ.
• Logout.java: Xử lý chức năng đăng xuất một cách an toàn bằng cách hủy bỏ Session của người dùng trên máy chủ, đảm bảo rằng thông tin phiên làm việc không còn tồn tại, chấm dứt quyền truy cập của người dùng.

