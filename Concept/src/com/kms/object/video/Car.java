package com.kms.object.video;

public class Car {
	final int wheel = 4;
	public String brand;
	protected String color;
	private int price;

	public Car() {
		System.out.println("부모 클래스의 기본 생성자");
	}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void enginStart() {
		System.out.println("열쇠로 시동 킹");
	}

	void enginStop() {
		System.out.println("열쇠로 시동 끔");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
