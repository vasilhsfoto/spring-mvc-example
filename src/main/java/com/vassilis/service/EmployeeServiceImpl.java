package com.vassilis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vassilis.dao.mappers.UserMapper;
import com.vassilis.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private UserMapper userMapper;  
	
	public Employee getEmployee() {
		return userMapper.getEmployee("vassilis");
	}
}
