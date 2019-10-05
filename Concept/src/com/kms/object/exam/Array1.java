package com.kms.object.exam;

public class Array1 {
	public static void main(String[] args) {
		//배열 선언 후 1~5까지의 값 넣기(for문 사용)
		
		//10~1 까지의 값 넣기(for문 사용)
		
		int[] arValue = new int[5];
		int[] arValue2 = new int[10];
		
		/*
		for(int i = 0; i<arValue.length; i++) {
			System.out.println(arValue[i]);
		}
		*/
		for(int i = 0; i<arValue.length; i++) {
			arValue[i]= i+1;
			System.out.printf("arValue[%d] = %d\n",i,arValue[i]);
		}
		
		for(int i = 9; i>=0; i--) {
			arValue2[i] = i+1;
			System.out.printf("arValue2[%d] = %d\n",i,arValue2[i]);
			
		}
		
		
	}
}
