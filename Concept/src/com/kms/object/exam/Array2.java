package com.kms.object.exam;

import java.util.Scanner;

public class Array2 {
	// 1동
	// 1호 2호 3호
	// 평균 월세&총 월세
	public static void main(String[] args) {
		int[] ho = new int[3];
		double avg = 0.0;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i + 1 + "호 월세를 입력하세요 : (단위 : 만원)");
			ho[i] = scan.nextInt();
			sum += ho[i];
		}
		System.out.println("1동 총 월세 : " + sum + "만원");
		avg = Double.parseDouble(String.format("%.2f", (double) sum / ho.length));
		System.out.println("평균 월세 : " + avg + "만원");
	}
}
