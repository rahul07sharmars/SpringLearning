package com.rahul.springbootdemo.service;

import com.rahul.springbootdemo.entity.Department;

import java.util.*;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);


	public void deleteDepartmentbyId(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);
}
