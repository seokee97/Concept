package com.kms.object.exam;

import java.util.Scanner;

public class ArrayShop {
	// ZARA
		// 강남점, 코엑스점, 명동점
		// 단위는 100만원 단위로 입력받는다.
		// 단, 평균 매출액은 만원단위 까지 출력한다.

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String[] zaraBranch = { "강남점", "코엑스점", "명동점" };
			int[] zaraPrice = new int[3];
			int sum = 0;
			double avg = 0.0;
			String best = "없음";
			int cnt = 0;
			
			for (int i = 0; i < zaraBranch.length; i++) {
				System.out.printf(zaraBranch[i] + "의 매출액을 입력하세요(단위 : 백만원) : ");
				zaraPrice[i] = scan.nextInt();
				sum += zaraPrice[i];
			}
			avg = Double.parseDouble(String.format("%.2f", (double) sum / zaraBranch.length));
			System.out.println("ZARA 총 매출액 : " + sum + "만원");
			System.out.println("평균 매출액 : " + avg + "만원");
			for(int i= 0;i<zaraBranch.length;i++) {
				if(zaraPrice[i]>avg) {
					cnt++;
					if(cnt ==1) best ="";
					best += zaraBranch[i]+"\n";
				}
			}
			System.out.println("인셉티브 매장\n"+best);
		}
}
