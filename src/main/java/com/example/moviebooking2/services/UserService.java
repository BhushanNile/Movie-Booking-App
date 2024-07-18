package com.example.moviebooking2.services;


import com.example.moviebooking2.dtos.SignUpRequestDto;
import com.example.moviebooking2.models.User;
import com.example.moviebooking2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signUp(SignUpRequestDto signUpRequest){

        //we should check if user is new
        Optional<User> user = userRepository.findByEmail(signUpRequest.getEmail());
        if (user.isPresent()) {
            throw new RuntimeException();
            //here for security reason we just throw generic exception,
            // else hackers will know exact reasons
        }
        User newUser = new User();
        newUser.setName(signUpRequest.getName());
        newUser.setEmail(signUpRequest.getEmail());
        newUser.setPhoneNumber(signUpRequest.getPhoneNumber());
        String password = signUpRequest.getPassword();

        //using Bcrypt to encode and save password
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        newUser.setPassword(encoder.encode(password));

        return userRepository.save(newUser);


    }

    public boolean login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isEmpty()) {
            throw new RuntimeException("Need to sign up");
        }else {
            System.out.println("Login successfully User name is :- "+user.get().getName());
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.matches(password,user.get().getPassword());

    }
}
