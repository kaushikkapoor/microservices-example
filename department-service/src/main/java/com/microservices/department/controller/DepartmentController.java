package com.microservices.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	private Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") Long departmentId) {
		log.info("Inside getDepartment of DepartmentController");
		return departmentService.getDepartmentById(departmentId);
	}

}
