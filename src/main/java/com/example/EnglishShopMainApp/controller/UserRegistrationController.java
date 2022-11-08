package com.example.EnglishShopMainApp.controller;

import com.example.EnglishShopMainApp.model.User;
import com.example.EnglishShopMainApp.model.dto.UserRegistrationDto;
import com.example.EnglishShopMainApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping
    public HttpStatus registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
        User user = userService.save(registrationDto);
        if (user ==null){
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

}
