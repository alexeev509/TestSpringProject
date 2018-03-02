package com.users.mapper;

import com.users.entity.User;
import com.users.entity.UserBuilder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMaper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new UserBuilder().setId(resultSet.getInt("id"))
                .setAge(resultSet.getInt("age"))
                .setEmail(resultSet.getString("email"))
                .setName(resultSet.getString("name"))
                .build();
    }
}
