package com.ohgiraffers.parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first/*")
public class FirstController {

	@GetMapping("regist")
	public void regist() {}
	
	/* 핸들러 메소드에 파라미터로 특정 몇가지 타입을 선언하게 되면 
	 * 핸들러 메소드 호출 시 인자로 값을 전달해준다.*/
	
	/* 1. HttpServletRequest를 매개변수로 선언하여 파라미터로 전달받은 값 꺼내기 
	 *    핸들러 메소드 매개변수로 HttpServletResponse도 사용 가능하다.
	 *    상위타입인 ServletRequest, ServletResponse도 사용 가능하며 WebRequest도 사용가능하다.
	 * */
	@PostMapping("regist")
	public String registMenu(Model model, HttpServletRequest request) {
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));
		
		String message = name + "을(를) 신규 메뉴 목록의 " + categoryCode + "번 카테고리에 " + price 
				+ "원으로 등록 하셨습니다!";
		System.out.println(message);
		
		model.addAttribute("message", message);
		
		return "first/messagePrinter";
	}
	
	@GetMapping("modify")
	public void modify() {}
	
	/* 2. @RequestParam으로 값 꺼내기 */
	/*
	 * 요청 파라미터를 매핑하여 호출 시 값을 넣어주는 어노테이션이다.
	 * @PathVariable처럼 변수 앞에 작성하면된다.
	 * form의 name 속성값과 매개변수의 이름이 다른 경우 @RequestParam("name")을 설정하면된다.
	 * 또한 어노테이션은 생략 가능하지만 명시적으로 작성하는 것이 의미 파악에 쉽다.
	 * 
	 * required 속성은 전달하는 form의 name속성이 일치하는 것이 없는 경우 400에러가 발생하는데
	 * required 속성을 false로 하게 되면 해당 name 값이 존재하지 않아도 null로 처리하며 에러가 발생하지 않는다.
	 * 
	 * 값이 넘어오지 않게 되면 ""빈 문자열로 넘어오게 되는데 이 때 parsing관련 에러가 발생할 수 있다.
	 * 값이 넘어오지 않는 경우 defaultValue를 이용하게 되면 기본값으로 사용할 수 있다.
	 * 
	 * */
	
	@PostMapping("modify")
	public String modifyMenuPrice(Model model, @RequestParam(required = false) String modifyName,
			@RequestParam(defaultValue = "0") int modifyPrice) {
		
		System.out.println(modifyName + " : " + modifyPrice);
		
		String message = modifyName + "메뉴의 가격을 " + modifyPrice + "원으로 가격을 변경하였습니다.";
		
		model.addAttribute("message", message);
		
		return "first/messagePrinter";
	}

		
		
}
	
	
	

