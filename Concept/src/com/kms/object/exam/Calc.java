package com.kms.object.exam;

import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		System.out.print("1. 계산하기\n2.종료하기\n-----------\n");
		int choice = scan.nextInt();
		if(choice == 2) {
			break;
		}
		System.out.print("계산 : ");
		
		int num1 = scan.nextInt();
		String oper = scan.next();
		int num2 = scan.nextInt();
		
		String result;
		
		switch(oper) {
		case "+":
			result = "" + (num1+num2);
			break;
		case "-":
			result = "" + (num1-num2);
			break;
		case "*":
			result = "" + (num1*num2);
			break;
		case "/":
			result = "" + (num1/num2);
			break;
		default :
			result = "사칙연산 외의 연산자는 사용할수 없습니다.";
		}
		System.out.println(result);

		if(choice == 2) {
			break;
		}
	}
}
}
