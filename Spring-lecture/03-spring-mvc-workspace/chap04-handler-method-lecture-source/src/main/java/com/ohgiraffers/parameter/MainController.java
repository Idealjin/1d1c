package com.ohgiraffers.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainController {

	@RequestMapping("/main")
	public void showMain() {
		
	}
	
}
