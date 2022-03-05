package com.ohgiraffers.mvc.employee.model.service;

import org.apache.ibatis.session.SqlSession;

import com.ohgiraffers.mvc.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.mvc.employee.model.dto.EmployeeDTO;
import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class EmployeeService {

	private EmployeeMapper mapper;
	
	public EmployeeDTO selectOneEmpById(String empId) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(EmployeeMapper.class);
		
		/* SqlSession과 함께 정보를 전달하여 조회한다. */
		EmployeeDTO selectedEmp = mapper.selectEmpById(empId);
		
		/* sqlSession 닫기 */
		sqlSession.close();
		
		return selectedEmp;
	}



}
