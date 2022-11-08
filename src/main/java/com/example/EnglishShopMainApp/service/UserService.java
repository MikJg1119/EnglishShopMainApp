package com.example.EnglishShopMainApp.service;

import com.example.EnglishShopMainApp.model.User;
import com.example.EnglishShopMainApp.model.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    User getUserByName(String name);
//    void addBookToUser(User user, Book book);
    User getUserByEmail(String email);

    User findUserById(int id);
}
