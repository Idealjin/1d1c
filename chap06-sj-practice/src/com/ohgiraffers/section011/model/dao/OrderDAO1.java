package com.ohgiraffers.section011.model.dao;

import static com.ohgiraffers.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.ohgiraffers.section011.model.dto.MenuDTO;
import com.ohgiraffers.section011.model.dto.OrderDTO;
import com.ohgiraffers.section011.model.dto.OrderMenuDTO;

public class OrderDAO1 {

	private Properties prop = new Properties();
	
	public OrderDAO1() {
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/order-query.xml"));
			
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<OrderDTO> selectAllOrder(Connection con) {
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<OrderDTO> orderList = null;
		
		String query = prop.getProperty("selectAllOrder");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			orderList = new ArrayList<>();
			
			while(rset.next()) {
				OrderDTO order = new OrderDTO();
				order.setCode(rset.getInt("ORDER_CODE"));
				order.setDate(rset.getString("ORDER_DATE"));
				order.setTime(rset.getString("ORDER_TIME"));
				order.setTotalOrderPrice(rset.getInt("TOTAL_ORDER_PRICE"));
				
				orderList.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return orderList;
	}

	public List<MenuDTO> selectOrderMenuBy(Connection con, int selCode2) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		List<MenuDTO> selMenu = null;
		
		String query = prop.getProperty("selectOrderMenuBy");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, selCode2);
			
			rset = pstmt.executeQuery();
			
			selMenu = new ArrayList<>();
			
			while(rset.next()) {
				MenuDTO selMenu2 = new MenuDTO();
				selMenu2.setCode(rset.getInt("MENU_CODE"));
				selMenu2.setName(rset.getString("MENU_NAME"));
				selMenu2.setPrice(rset.getInt("MENU_PRICE"));
				
				selMenu.add(selMenu2);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
		
		return selMenu;
	}
	
	
	
}
