package vn.iotstar.dao;

import vn.iotstar.models.UserModel;

public interface UserDao {
    UserModel getByUsername(String username);
}