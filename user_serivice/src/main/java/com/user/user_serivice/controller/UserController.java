package com.user.user_serivice.controller;

import com.user.user_serivice.entity.User;
import com.user.user_serivice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId")  Long userId){
        User user = this.userService.getUser(userId);
//        http://localhost:9002/contact/user/1311
        List contactList = restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);
        user.setContacts(contactList);
        return  user;
    }
}
