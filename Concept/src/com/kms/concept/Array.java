package com.kms.concept;

public class Array {
	public static void main(String[] args) {
		// 배열 초기화
		/*
		 * 배열의 선언
		 * 1. 자료형 [] 배열명 = new 자료형[길이];
		 * 2.자료형 배열명[] = {값1, 값2};
		 * 3. 자료형 [] 배열명;	
		*/
		System.out.println("1. 자료형 [] 배열명 = new 자료형[길이]");
		int [] arData = new int[4];
		System.out.println(arData);
		// 값을 넣지 않으면 자동으로 값은 0이다
		System.out.println(arData[0]);
		arData[0] = 10;
		System.out.println(arData[0]);
		
		//.length 배열의 길이값
		System.out.println(arData.length);
		
		System.out.println("2.자료형 배열명[] = {값1, 값2}");
		int arPrice[] = {1000,2000,3450};
		System.out.println(arPrice[2]);
		
		//for문으로 배열값 나열
		System.out.println("for문으로 배열값 나열");
		for(int i = 0; i<arPrice.length;i++) {
			System.out.println(arPrice[i]);
		}
	}
}
