package com.kms.concept;

public class Method {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//반환값이 있는 메서드 호출
		System.out.println(sum(num1, num2));
		
		//반환값이 없는 메서드 호출
		hello();
		
		
	}
	
	//반환값이 있는 메서드
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	//반환값이 없는 메서드
	public static void hello() {
		System.out.println("hello");
	}
}
