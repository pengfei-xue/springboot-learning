package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping(value="/{id}/get.json")
    public @ResponseBody
    Department getDepartmentById(@PathVariable Integer id) {
        return departmentService.getDepartmentById(id);
    }
}
