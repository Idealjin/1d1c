package com.ohgiraffers.section01.xmlmapper;

import org.apache.ibatis.session.SqlSession;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;

import static com.ohgiraffers.common.Template.getSqlSession;

import java.util.List;

public class ElementTestService {

	private ElementTestMapper mapper;
	
	public void selectChacheTest() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		for(int i = 0; i < 10; i++) {
			Long startTime = System.currentTimeMillis();
			
			List<String> nameList = mapper.selectCacheTest();
			System.out.println(nameList);
			
			Long endTime = System.currentTimeMillis();
			Long interval = endTime - startTime;
			System.out.println("수행 시간 : " + interval + "(ms)");
		}
		sqlSession.close();
	}

	public void selectResultMapTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectResultMapTest();
		
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		
		sqlSession.close();
		
	}

	public void selectResultMapConstructorTest() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();
		
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		
		sqlSession.close();
		
	}

	public void selectResultMapAssociationTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();
		
		for(MenuAndCategoryDTO menu : menuList) {
			System.out.println(menu);
			System.out.println(menu.getCategory());
			System.out.println(menu.getCategory().getName());
			System.out.println(menu.getCategory().getCode());
		}
		
		sqlSession.close();
		
	}

	public void selectResultMapCollectionTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<CategoryAndMenuDTO> categoryList = mapper.selectResultMapCollectionTest();
		
		for(CategoryAndMenuDTO category : categoryList) {
			System.out.println(category);
		}
	}

	public void selectSqlTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectSqlTest();
		
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		
		
		
	}

}
