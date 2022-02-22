package com.ohgiraffers.section02.provider;

import org.apache.ibatis.jdbc.SQL;

public class SelectBuilderProvider {

	
	//SQL문을 문자열 형태로 반환하기 위해서 String 반환타입을 지정
	public String selectAllMenu() {
		
		return new SQL()
				.SELECT("A.MENU_CODE")
				.SELECT("A.MENU_NAME")
				.SELECT("A.MENU_PRICE")
				.SELECT("A.CATEGORY_CODE")
				.SELECT("A.ORDERABLE_STATUS")
				.FROM("TBL_MENU A")
				.WHERE("A.ORDERABLE_STATUS = 'Y'").toString();
	}
	
}
