package com.rahul.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.springbootdemo.entity.Department;
import com.rahul.springbootdemo.service.DepartmentService;
//import com.rahul.springbootdemo.service.DepartmentServiceImp;

import java.util.*;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	 
	 private final Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class); 
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		
//		DepartmentService departmentService = new DepartmentServiceImp();
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		LOGGER.info("Inside fetchDepartmentList of DepartmentController");
		return departmentService.fetchDepartmentList();
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside fetchDepartmentById of DepartmentController");
		return departmentService.fetchDepartmentById(departmentId);
	}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentbyId(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside deleteDepartmentbyId of DepartmentController");
		departmentService.deleteDepartmentbyId(departmentId);
		return "Department deleted Successfully!!";
		
	}
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId,
										@RequestBody Department department) {
		LOGGER.info("Inside updateDepartment of DepartmentController");
		return departmentService.updateDepartment(departmentId, department);
		
	}
	
	@GetMapping("/department/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		LOGGER.info("Inside fetchDepartmentByName of DepartmentController");
		return departmentService.fetchDepartmentByName(departmentName);
	}
}
