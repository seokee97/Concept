package com.kms.concept;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		  최초 한번 실행후 조건식 참/거짓 판별
		  do{
		  
		  수행문;
		  
		  증감식;
		  
		  }while(조건식);
		  
		 */
		Scanner scan = new Scanner(System.in);
		String answer;
		int cnt = 0;
		do {
			System.out.print("음악을 재생하시겠습니까? (Y or N)");
			answer = scan.next();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을  %d번째 재생했습니다.", ++cnt);
			}
			
		}while(answer.equals("Y"));
		System.out.println("------종료------");
		scan.close();
	}

}