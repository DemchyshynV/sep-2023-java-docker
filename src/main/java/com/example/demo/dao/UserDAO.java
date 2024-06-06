package com.example.demo.dao;

import com.example.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserModel, Integer> {
}
