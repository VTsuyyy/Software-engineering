package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.model.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<UserDTO> getListUser(){
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user : userRepository.findAll()){
            userDTOList.add(UserMapper.toUserDto(user));
        }
        return userDTOList;
    }

    @Override
    public List<UserDTO> getUserByID(int id) {
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user : userRepository.getUserById(id)){
            userDTOList.add(UserMapper.toUserDto(user));
        }
        return userDTOList;
    }
}
