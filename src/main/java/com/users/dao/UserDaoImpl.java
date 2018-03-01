package com.users.dao;

import com.users.entity.User;
import com.users.mapper.UserMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    private final String GET_ALL = "SELECT * FROM public.user";

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> geAllUsers() {
        jdbcTemplate.query(GET_ALL, new UserMaper());
        return null;
    }
}
