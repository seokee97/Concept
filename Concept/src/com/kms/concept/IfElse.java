package com.kms.concept;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// if ~ else
		/*
		 if(조건식) { 
		  수행문 
		 } else if(조건식) { 
		  수행문 
		 } else { 
		  수행문 
		 }
		 */

		System.out.println("성별을 입력하세요 : ");
		String sex = scan.next();

		if (sex.equals("남자")) {
			System.out.println("101호로 가세요");
		} else if (sex.equals("여자")) {
			System.out.println("201호로 가세요");
		} else {
			System.out.println("잘 못 오셨습니다.");
		}
		scan.close();
	}
}
