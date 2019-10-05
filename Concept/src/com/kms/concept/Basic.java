package com.kms.concept;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
			// 형변환
			String s = "Hey Hey"; // 문자열
			char ch = 'A'; // 문자삽입 -> 아스키코드
			int iNum = 10;
			float fNum = 3.3f;
			double dNum = 10.4d;
			dNum = fNum; // 자동형변환
			dNum = (double) fNum; // 강제 형 변환

			// 출력
			System.out.println("야 야 " + s); // 자동개행
			System.out.printf("%.1f\n", fNum); // 변수값을 넣을 때
			System.out.print(s); // 아무것도 없는 것
			System.out.println();

			// 입력

			Scanner scan = new Scanner(System.in);
			System.out.print("문자를 입력하세요 : ");
			String sInput = scan.next();
			System.out.print("숫자를 입력하세요 : ");
			int iInput = scan.nextInt();
			scan.close(); // 마지막에 닫아주자!!

			// 참&거짓
			boolean flag = true;

			flag = !flag; // '!' 부정의 의미
			System.out.println(flag);

			// 연산자
			int a = 10;
			int b = 20;
			int c = 30;
			int d;
			System.out.printf("a + b = %d\n", a + b);
			System.out.printf("a - b = %d\n", a - b);
			System.out.printf("a * b = %d\n", a * b);
			System.out.printf("a / b = %d\n", a / b);
			System.out.printf("c %% a = %d\n", c % a);
			a++; // 후위증감(사용하고 증감)
			++a; // 전위증감(먼저 증가 시키고 사용)

			d = a;// '='은 대입연산자이다
			a += 1; // a = a + 1
			System.out.printf("a += 1 => a 값 : %d\n", a);
			a -= 1; // a = a - 1
			System.out.printf("a -= 1 => a 값 : %d\n", a);
			a *= 2; // a = a * 1
			System.out.printf("a *= 1 => a 값 : %d\n", a);
			a /= 2; // a = a / 1
			System.out.printf("a /= 1 => a 값 : %d\n", a);

			// 비교

			System.out.println("a가b보다 큰가?");
			System.out.println(a > b);
			System.out.println("a가b보다 작은가?");
			System.out.println(a < b);
			System.out.println("a가b 이상인가?");
			System.out.println(a >= b);
			System.out.println("a가b 이하인가?");
			System.out.println(a <= b);
			System.out.println("a+b가 c랑 같은가?");
			System.out.println(a + b == c); // '==' 문자열비교를 제외한것을 비교할때 쓰는것
			System.out.println("a+b가 c랑 다른가?");
			System.out.println(a + b != c); // '!=' 다른지를 비교하는것

			String str1 = new String("안녕하세요");
			String str2 = str1;

			System.out.println("str1와 str2가 같은가?");
			System.out.println(str1.equals(str2)); // 문자열 비교시 변수.equals(변수)

			// 논리연산
			/*
			  && => and (모두 참일때) 
			  || => or (한개만 참이면 참)
			 */

			// final
			// final을 사용하면 그 변수는 다른 값으로 바꿀수 없다.
			int num1 = 10;
			num1 = 20;

			final int num2 = 10;
			// num2 = 20; // 오류 남

			// 삼항연산자
			int age = 19;
			// ((조건식) ? (참일 때 사용) : (거짓일 때 사용))
			System.out.println((age > 19 ? "성인입니다." : "청소년입니다."));
			if (age > 19) {
				System.out.println("성인입니다.");
			} else {
				System.out.println("청소년입니다.");
			}
	}

}
