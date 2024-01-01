package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDTO> getListUser();
    public List<UserDTO> getUserByID(int id);
}
