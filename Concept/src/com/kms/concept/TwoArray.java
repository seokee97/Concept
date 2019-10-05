package com.kms.concept;

public class TwoArray {
	public static void main(String[] args) {
		
		 // 2차원 배열 서언
		  
		 // 1. 자료형[][] 배열명 = new 자료형[행][열];
		  
		 // 2. 자료형[][] 배열명 = { {값1, 값2,...}, {값3,값4,...} };
		 

		// 구구단(for문 하나로)
		/*for (int i = 1; i < 90; i++) {
			if(i%10==0) {
				i++;
				System.out.println();
			}
			System.out.printf("%d * %d = %d\n",(i/10)+1,i%10, ((i/10)+1)*(i%10));
		}
		*/
		
		int[][] gugudan = new int[8][8];
		
		for(int i = 0; i<gugudan.length;i++) {
			for(int j =0; j<gugudan.length;j++) {
				gugudan[i][j] = (i+1)*(j+1);
				System.out.printf("%d * %d = %d\n", i+1, j+1,gugudan[i][j]);
			}
			System.out.println();
		}
	}
}
