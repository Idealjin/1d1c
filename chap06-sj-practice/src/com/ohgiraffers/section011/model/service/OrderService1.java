package com.ohgiraffers.section011.model.service;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.ohgiraffers.section011.model.dto.CategoryDTO;
import com.ohgiraffers.section011.model.dto.MenuDTO;
import com.ohgiraffers.section011.model.dao.OrderDAO1;
import com.ohgiraffers.section011.model.dto.OrderDTO;
import com.ohgiraffers.section011.model.dto.OrderMenuDTO;



public class OrderService1 {

	private static OrderDAO1 orderDAO = new OrderDAO1();
	
	/**
	 * <pre>
	 * 오더 전체 조회용 메소드
	 * </pre>
	 * 
	 * @return
	 */
	public List<OrderDTO> selectAllOrder() {
		
		//1. Connection 생성
		Connection con = getConnection();
		//2. DAO의 모든 카테고리 조회용 메소드를 호출하여 결과를 리턴받기
		List<OrderDTO> orderList =orderDAO.selectAllOrder(con);
		//3. 커넥션 닫기
		close(con);
		//4. 반환 받은 값 리턴하기
		return orderList;
	}

	public static List<MenuDTO> selectOrderMenuBy(int selCode2) {
		
		Connection con = getConnection();
		List<MenuDTO> orderMenuList = orderDAO.selectOrderMenuBy(con, selCode2);
		close(con);
		return orderMenuList;
		
	}
	
	
	
	
	
}
