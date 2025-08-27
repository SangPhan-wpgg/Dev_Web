package vn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vn.iotstar.dao.UserDao;
import vn.iotstar.configs.DBConnection;
import vn.iotstar.models.UserModel;

public class UserDaoImpl implements UserDao {
    
    @Override
    public UserModel getByUsername(String username) {
        // Tên bảng và cột đã được chỉnh sửa để khớp với UserModel
        String sql = "SELECT * FROM [User] WHERE username = ? ";
        
        try (Connection conn = new DBConnection().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    UserModel user = new UserModel();
                    user.setId(rs.getInt("id"));
                    user.setEmail(rs.getString("email"));
                    user.setUserName(rs.getString("username"));
                    user.setFullName(rs.getString("fullName"));
                    user.setPassWord(rs.getString("passWord"));
                    user.setAvatar(rs.getString("avatar"));
                    user.setRoleid(rs.getInt("roleid"));
                    user.setPhone(rs.getString("phone"));
                    user.setCreatedDate(rs.getDate("createdDate"));
                    return user;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}