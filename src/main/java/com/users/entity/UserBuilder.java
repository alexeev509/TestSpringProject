package com.users.entity;

public class UserBuilder {
    private int age;
    private int id;
    private String name;
    private String email;

    public UserBuilder() {
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setName(name);
        user.setAge(age);
        return user;
    }

}
