package com.kms.object.exam;

import java.util.Scanner;

public class IfElseExam2 {
	public static void main(String[] args) {
		final String UID = "java";
		final String UPW = "abc123";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 : ");
		String id = scan.next();
		if(id.equals(UID)) {
			System.out.println("ID일치");
			System.out.print("PW를 입력하세요 : ");
			String pw = scan.next();
			if(pw.equals(UPW)) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("id 불일치");
		}
		
		System.out.println("---종료---");
		scan.close();
		
	}
}
