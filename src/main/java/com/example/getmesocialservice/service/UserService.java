package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.getmesocialservice.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public User updateUser(int id, User user) {
        return userRepository.updateUser(id,user);
    }

    public User deleteUser(int id) {
        return userRepository.deleteUser(id);
    }
}
