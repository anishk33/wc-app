package com.ajce2008.wc.services;

import com.ajce2008.wc.models.User;
import com.ajce2008.wc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public List<User> getAllUsersSorted() {
        return userRepository.findAllByOrderByUserNameAsc();
    }
}
