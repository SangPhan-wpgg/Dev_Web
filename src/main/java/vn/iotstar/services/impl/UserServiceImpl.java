package vn.iotstar.services.impl;

import vn.iotstar.dao.UserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public UserModel login(String username, String password) {
        // Lấy thông tin người dùng từ cơ sở dữ liệu dựa trên username
        UserModel user = userDao.getByUsername(username);

        // Kiểm tra xem người dùng có tồn tại và mật khẩu có khớp không
        if (user != null && password.equals(user.getPassWord())) {
            return user;
        }
        return null;
    }

    @Override
    public UserModel getByUsername(String username) {
        // Gọi phương thức tương ứng từ lớp DAO để lấy người dùng
        return userDao.getByUsername(username);
    }
}