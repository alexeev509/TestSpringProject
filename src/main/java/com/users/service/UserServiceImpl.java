package com.users.service;

import com.users.dao.UserDao;
import com.users.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public List<User> geAllUsers() {
        //Here business logic!!!
        return userDao.geAllUsers();
    }
}
