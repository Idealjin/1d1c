package com.ohgiraffers.mvc.employee.model.dao;

import com.ohgiraffers.mvc.employee.model.dto.EmployeeDTO;

public interface EmployeeMapper {

	EmployeeDTO selectEmpById(String empId);

	
}
