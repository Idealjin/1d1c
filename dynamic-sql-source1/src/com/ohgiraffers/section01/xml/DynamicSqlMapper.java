package com.ohgiraffers.section01.xml;

import java.util.List;
import java.util.Map;

import com.ohgiraffers.common.MenuDTO;

public interface DynamicSqlMapper {

	List<MenuDTO> selectMenuByPrice(Map<String, Integer> map);

	List<MenuDTO> selectMenuByName(Map<String, String> map);
	
}
