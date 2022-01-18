package com.rahul.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.springbootdemo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	//naming convention is important here
	//we don't need to implement the complete method
	//just name the method correctly and it will do the rest
	//of thing 
	//findBy and then the name of entity in camelcase
	public Department findByDepartmentName(String departmentName);;
	public Department findByDepartmentNameIgnoreCase(String departmentName);
}
    