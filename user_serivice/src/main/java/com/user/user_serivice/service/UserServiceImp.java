package com.user.user_serivice.service;

import com.user.user_serivice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

//    Fake User
    List<User> userList = List.of(
            new User(1311L,"Muhammad Farhan","030531022"),
            new User(1312L,"Sammar Abbas","030533434324"),
            new User(1313L,"Sammar Abbas","033434333433")
        );

    @Override
    public User getUser(Long id) {
        return this.userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
