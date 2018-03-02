package com.users.dao;

import com.users.entity.User;
import com.users.mapper.UserMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    private final String GET_ALL = "SELECT * FROM public.user";
    private final String GET_USER_BY_ID = "SELECT * FROM public.user WHERE id=?";
    private final String SAVE_USER = "INSERT INTO public.user (name,email,age) VALUES(?,?,?)";
    private final String UPDATE_USER = "UPDATE public.user SET name=?, email=?, age=? WHERE id=?";
    private final String DELETE_USER = "DELETE FROM public.user WHERE id=?";

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user) {
        jdbcTemplate.update(SAVE_USER, user.getName(), user.getEmail(), user.getAge());
    }

    public void delete(int id) {
        jdbcTemplate.update(DELETE_USER, id);
    }

    public User getById(int id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new UserMaper(), id);
    }

    public void update(User user) {
        jdbcTemplate.update(UPDATE_USER, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    public List<User> geAllUsers() {
        return jdbcTemplate.query(GET_ALL, new UserMaper());
    }
}
