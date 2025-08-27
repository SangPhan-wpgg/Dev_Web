<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tạo tài khoản mới</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h2 class="card-title text-center">Tạo tài khoản mới</h2>
                    <c:if test="${not empty alert}">
                        <div class="alert alert-danger" role="alert">
                            ${alert}
                        </div>
                    </c:if>
                    
                    <form action="${pageContext.request.contextPath}/register" method="post">
                        <div class="mb-3">
						    <label for="username" class="form-label">Tài khoản</label>
						    <div class="input-group">
						        <span class="input-group-text"><i class="fa fa-user"></i></span>
						        <input type="text" id="username" name="username" class="form-control" placeholder="Tên tài khoản" required>
						    </div>
						</div>

                        <div class="mb-3">
                            <label for="password" class="form-label">Mật khẩu</label>
                            <div class="input-group">
                                <span class="input-group-text"><i class="fa fa-lock"></i></span>
                                <input type="password" id="password" name="password" class="form-control" placeholder="Mật khẩu" required>
                            </div>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Đăng ký</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>