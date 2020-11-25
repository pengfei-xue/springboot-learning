package com.example.demo.service.imp;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServieceImp implements UserService {

    @Autowired UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
}
