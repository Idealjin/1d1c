package com.sangjin.memo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		int temp = 1;
		temp+=1;
		System.out.println(temp);
		String temp1 = Integer.toString(temp);
		temp1 += 1;
		System.out.println(temp1);
		int temp2 = Integer.parseInt(temp1);
		temp2 += 1;
		System.out.println(temp2);

	}

}
