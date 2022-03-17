package com.ohgiraffers.section02.xmlconfig;
public class PersonalAccount implements Account {
	private int bankCode;
	private String accNo;
	private String accPwd;
	private int balance;
	
	public PersonalAccount(int bankCode, String accNo, String accPwd) {
		super();
		this.bankCode = bankCode;
		this.accNo = accNo;
		this.accPwd = accPwd;
	}
	
	public PersonalAccount(int bankCode, String accNo, String accPwd, int balance) {
		super();
		this.bankCode = bankCode;
		this.accNo = accNo;
		this.accPwd = accPwd;
		this.balance = balance;
	}
	/**
	 *<pre>
	 *  잔액을 출력해주는 메소드
	 *</pre>
	 */
	@Override
	public String getBalance() {
		return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니다.";
	}
	/**
	 * <pre>
	 *  금액을 매개변수로 전달 받아 잔액을 증가(입금)시켜주는 메소드
	 * </pre>
	 */
	@Override
	public String deposit(int money) {
		String str = "";
		
		if(money >= 0) {
			this.balance += money;
			str = money + "원이 입금되었습니다.";
		} else {
			str = "금액을 잘못 입력하셨습니다.";
		}
		return str;
	}
	/**
	 * <pre>
	 *  금액을 매개변수로 받아 잔액을 감소(출금) 시켜주는 메소드
	 * </pre>
	 */
	@Override
	public String withDraw(int money) {
		
		String str = "";
		
		if(this.balance >= money) {
			this.balance -= money;
			str = money + "원이 출금되었습니다.";
		} else {
			str = "잔액이 부족합니다. 잔액을 확인해주세요.";
		}
		return str;
	}
}