package com.users.service;

import com.users.dao.UserDao;
import com.users.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public List<User> geAllUsers() {
        //Here business logic!!!
        return userDao.geAllUsers();
    }
}
