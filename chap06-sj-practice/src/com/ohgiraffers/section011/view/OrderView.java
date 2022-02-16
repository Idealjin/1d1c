package com.ohgiraffers.section011.view;


import java.util.List;
import java.util.Scanner;

import com.ohgiraffers.section011.model.dto.MenuDTO;
import com.ohgiraffers.section011.model.dto.OrderDTO;
import com.ohgiraffers.section011.model.service.OrderService1;

public class OrderView {

	OrderService1 orderService = new OrderService1();
	Scanner sc = new Scanner(System.in);
	
	public void mainView() {
		
		//1. 주문 코드들을 전부 조회
		//2. 확인하고 싶은 코드를 입력
		//3. 입력받은 코드에 해당하는 메뉴이름 출력
		
		
		
		System.out.println("======== 주문 조회 프로그램 ========");
		List<OrderDTO> selOrder = orderService.selectAllOrder();
		
		for(OrderDTO order : selOrder) {
			System.out.println(order.getCode());
		}
		
		System.out.print("조회하실 코드를 선택해주세요. : ");
		int selCode = sc.nextInt();
		
		int selCode2 = 0;
		for(int i = 0; i < selOrder.size(); i++) {
			OrderDTO order2 = selOrder.get(i);
			if(order2.getCode() == selCode) {
				selCode2 = order2.getCode();
			}
		}
		
		List<MenuDTO> selMenu = OrderService1.selectOrderMenuBy(selCode2);
		
		for(MenuDTO sel : selMenu) {
			System.out.println("주문 코드 : " + sel.getCode() 
			+ ", 주문한 메뉴 : " + sel.getName() 
			+ ", 가격 :" + sel.getPrice());

			
		}
		
		
		
		
		
	}
	
}
