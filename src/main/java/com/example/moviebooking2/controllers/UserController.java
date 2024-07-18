package com.example.moviebooking2.controllers;


import com.example.moviebooking2.dtos.ResponseStatus;
import com.example.moviebooking2.dtos.SignUpRequestDto;
import com.example.moviebooking2.dtos.SignUpResponseDto;
import com.example.moviebooking2.models.User;
import com.example.moviebooking2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public SignUpResponseDto signup(SignUpRequestDto signUpRequest){
        User user = userService.signUp(signUpRequest);
        return new SignUpResponseDto(user.getId(), ResponseStatus.SUCCESS);
    }
    public boolean login(String email, String password){
        return userService.login(email,password);
    }


}
