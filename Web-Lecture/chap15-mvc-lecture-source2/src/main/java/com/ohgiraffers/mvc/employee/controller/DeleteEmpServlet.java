package com.ohgiraffers.mvc.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ohgiraffers.mvc.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.mvc.employee.model.service.EmployeeService;


@WebServlet("/employee/delete")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String empNo = request.getParameter("empId2");
		
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEmpId(empNo);
		
		System.out.println("empNo : " + empNo);
		
		EmployeeService empService = new EmployeeService();
		int result = empService.deleteEmp(emp);
		
		String path = "";
		if(result > 0) {
			path = "/WEB-INF/views/common/successPage.jsp";
			request.setAttribute("successCode", "deleteEmp");
		} else {
			path = "/WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("message", "삭제에 실패하셨습니다.");
		}
		
		
	}

}
