package com.canada.mortgage.controller;

import com.canada.mortgage.entity.MortgageInfo;
import com.canada.mortgage.entity.User;
import com.canada.mortgage.repository.MortgageInfoRepository;
import com.canada.mortgage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {


    @Autowired
    UserRepository userRepo;

    @Autowired
    MortgageInfoRepository mortgageInfoRepo;

    /*
    *
    * New User Registration API */

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        if(user!=null) {
            return userRepo.save(user);
        }
        else {
            return user;
        }


    }

    /*
     *
     * submit mortgage form API */

    @PostMapping("/apply-mortgage")
    public MortgageInfo applyForMortgage(@RequestBody MortgageInfo mortgageInfo) {
        if(mortgageInfo!=null) {
            return mortgageInfoRepo.save(mortgageInfo);
        }
        else {
            return mortgageInfo;
        }
    }

    /*
     *
     * New User Registration API */
    @CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
    @PostMapping("/login")
    public List<User> login(@RequestBody User user){
        if(user!=null) {
            String emailAddress  = user.getEmailAddress();
             List userList = userRepo.findByEmailAddress(emailAddress);
             return userList.size()>0? userList: null;
        } else {
            return null;
        }

    }
}
