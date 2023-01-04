package com.microservices.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	private Logger log = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(Long departmentId) {
		log.info("Inside getDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
