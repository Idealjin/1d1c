package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import com.ohgiraffers.common.MenuDTO;

import static com.ohgiraffers.common.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MenuService {

	private DynamicSqlMapper mapper;
	
	public void selectMenuByPrice(int price) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		
		//기본 자료형으로 조건문의 값을 비교할 수 없다. hashmap의 key 혹은 DTO의 getter를 이용하여 값을 확인한다.
		
		Map<String, Integer> map = new HashMap<>();
		map.put("price", price);
		
//		MenuDTO map = new MenuDTO();
//		map.setPrice(price);
		
		List<MenuDTO> menuList = mapper.selectMenuByPrice(map);
		
		if(menuList != null && menuList.size() > 0) {
			for(MenuDTO menu : menuList) {
				System.out.println(menu);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
		
		sqlSession.close();
	}

	public void selectMenuByName(String name) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		
		List<MenuDTO> menuList = mapper.selectMenuByName(map);
		
		if(menuList != null && menuList.size() > 0) {
			for(MenuDTO menu : menuList) {
				System.out.println(menu);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
		
		sqlSession.close();
	}
	
}
