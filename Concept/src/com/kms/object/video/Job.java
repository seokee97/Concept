package com.kms.object.video;

import java.util.Random;

class Person {
	String name;
	int age;
	String gender;
	int money;

	public Person() {
	}

	public Person(String name, int age, String gender, int money) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}

}

class Teacher extends Person {
	String subject;
	String position;
	private int income = 10_000_000;
	int cnt = 0;

	public Teacher(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}

	void teach(String subject) {
		cnt++;
		if (cnt % 10 == 0) {
			income *= 1.1;
		}
		this.subject = subject;
		money += income;
		System.out.println(name + " " + this.position + "이(가)" + this.subject + "을(를) 강의중");
		System.out.println("통장 잔고 : " + money + "원");
	}
}

public class Job {
	public static void main(String[] args) {
		Teacher 김민석 = new Teacher("김민석", 20, "남자", 0, "강사");
		String[] arSub = { "자바", "C언어", "파이썬" };
		Random r = new Random();

		int index = 0;
		index = r.nextInt(3); // 0~9까지의 랜덤한 수
		for (int i = 0; i < 100; i++) {
			김민석.teach(arSub[index]);
		}

		System exit;
	}
}
