package com.example.demo.controllers;

import com.example.demo.dao.UserDAO;
import com.example.demo.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserDAO userDAO;

    @GetMapping
    public List<UserModel> getAll() {
        return userDAO.findAll();
    }

    @PostMapping
    public UserModel create(@RequestBody UserModel userModel) {
        return userDAO.save(userModel);
    }
}
