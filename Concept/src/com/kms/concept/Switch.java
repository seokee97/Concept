package com.kms.concept;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		/*
		  switch(조건식){ //조건식에 연산가능
		   case 1: 
		   수행문 
		   break;
		 
		  case 2: 
		  수행문 
		  break;
		  
		  ...
		  
		  default: 
		  수행문
		  break; 
		  
		  }
		 */

		Scanner scan = new Scanner(System.in);
		int readBook = scan.nextInt();
		switch (readBook / 10) {
		case 0:
			System.out.println("조금 더 노력하세요");
			break;

		case 1:
			System.out.println("책 읽는 것을 즐기는 분");
			break;

		case 2:
			System.out.println("책을 사랑 하는 분");
			break;

		default:
			System.out.println("당신은 다독왕");
			break;
		}
	}
}
