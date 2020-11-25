package com.example.demo.service.imp;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department getDepartmentById(Integer id) {
        Department d = departmentRepository.getById(id);
        System.out.println(d.toString());
        return d;
    }
}
