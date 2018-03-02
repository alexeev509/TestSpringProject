package com.users.service;

import com.users.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void delete(int id);

    User getById(int id);

    void update(User user);

    List<User> geAllUsers();
}
