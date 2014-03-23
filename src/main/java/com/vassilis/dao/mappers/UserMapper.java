package com.vassilis.dao.mappers;

import com.vassilis.model.Employee;

public interface UserMapper {
	Employee getEmployee(String name);
}
