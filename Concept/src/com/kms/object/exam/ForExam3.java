package com.kms.object.exam;

public class ForExam3 {

	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 0; i < 7; i++) {
			if (i < 4) {
				ProductStar(space, star);
				space -= 1;
				star += 2;
				
			} else {
				if(i == 4) {
					space = 1;
					star = 5;
				}
				ProductStar(space, star);
				space += 1;
				star -= 2;
			}
		}

	}

	//별생성기
	public static void ProductStar(int space, int star) {
		for (int j = 0; j < space; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k < star; k++) {
			System.out.print("*");
		}
		for (int l = 0; l < space; l++) {
			System.out.print(" ");
		}
		System.out.println();
	}

}
