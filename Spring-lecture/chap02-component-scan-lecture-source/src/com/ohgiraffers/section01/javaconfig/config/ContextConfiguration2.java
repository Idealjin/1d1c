package com.ohgiraffers.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.ohgiraffers.section01.javaconfig.MemberDAO;

@Configuration
//@ComponentScan(basePackages ="com.ohgiraffers.section01.javaconfig",
//			  excludeFilters = {
//				@ComponentScan.Filter(
//						// 1. 타입으로 설정
//						//type=FilterType.ASSIGNABLE_TYPE,classes= {MemberDAO.class})  
//						// 2. 어노테이션 종류로 설정
//						//type=FilterType.ASSIGNABLE_TYPE,classes= {org.springframework.stereotype.Component.class})  
//						// 3. 표현식으로 설정
//						//type=FilterType.REGEX,
//						//pattern= {"com.ohgiraffers.section01.*"})
//						// 4.ASPECTJ:포인트컷 표현식으로 클래스를 매치하는 용도
//						
//			  })
public class ContextConfiguration2 {

	
	
}
