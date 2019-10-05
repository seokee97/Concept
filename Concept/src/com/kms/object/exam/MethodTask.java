package com.kms.object.exam;

import java.util.Scanner;

public class MethodTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 홀짝
		System.out.println(changeEvenNum(3));

		System.out.println("----------------");

		// 1부터 내가 입력한 정수까지의 누적합
		System.out.print("몇까지 구할지?");
		int iNum1 = scan.nextInt();
		System.out.println(sum(iNum1));

		System.out.println("----------------");

		// 두 정수의 나눗셈 메서드
		int iNum2 = 20;
		int iNum3 = 10;
		System.out.println("두 정수의 나눗셈\n" + division(iNum2, iNum3));

		System.out.println("----------------");

		// 정수를 한글로 바꿔주는 메서드
		changeToHangeul("1024");
	}

	// 홀수를 짝수로 바꿔주는 메서드
	public static int changeEvenNum(int num) {
		if (num % 2 == 1) {
			num += 1;
		}
		return num;
	}

	// 1부터 내가 입력한 정수까지의 누적합을 구해주는 메서드
	public static int sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static int division(int num1, int num2) {

		return num1 / num2;
	}

	// 정수를 한글로 바꿔주는 메서드

	public static void changeToHangeul(String data) {
		String hangle = "공일이삼사오육칠팔구";
		String result = "";
		int num = Integer.parseInt(data);
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(num % 10);
			num /= 10;
			;
		}
		for(int i = data.length()-1; i>-1;i--) {
			System.out.print(result.charAt(i));
		}

	}

}
