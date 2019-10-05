package com.kms.concept;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "Y";
		int cnt = 0;
		while (answer.equals("Y")) {
			System.out.print("음악을 재생하시겠습니까? (Y or N)");
			answer = scan.next();

			if (answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++cnt);

			}
		}
		System.out.println("--종료--");
		scan.close();
	}
}
