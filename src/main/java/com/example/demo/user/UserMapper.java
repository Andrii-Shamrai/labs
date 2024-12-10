package com.example.demo.user;


import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        return new UserDto(user.getName(), user.getSurname(), user.getEmail(), user.getContactNumber());
    }
}