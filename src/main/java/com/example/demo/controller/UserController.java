package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value="/user")
@Controller
public class UserController {

    @Autowired UserService us;

    @RequestMapping(value="/get/all.json", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        return us.getAllUsers();
    }

    @GetMapping(value="/get/{id}/get.json")
    public @ResponseBody User getUserById(@PathVariable long id) {
        return us.getUserById(id);
    }

    @GetMapping(value="/get/get.json")
    public @ResponseBody User getUserByIdReqParams(@RequestParam(name="id", required = true) long id) {
        return us.getUserById(id);
    }
}
