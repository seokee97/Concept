package com.kms.object.exam;

import java.util.Scanner;

public class ForExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int gugudan = scan.nextInt();

		for (int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", gugudan, (i+1), gugudan * (i+1));
		}
	}
}
