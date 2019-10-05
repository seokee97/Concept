package com.kms.object.video;

public class CarTest {
	public static void main(String[] args) {
		SuperCar superCar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrai","Red", 45000, "sport");
		System.out.println(ferrari);
		ferrari.enginStart();
		ferrari.enginStop();
		
	}
}