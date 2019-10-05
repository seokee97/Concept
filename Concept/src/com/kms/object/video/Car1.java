package com.kms.object.video;

public class Car1 {
	int price;
	String color;
	String brand;
	//OverLoading
	//오버로딩 기본 생성자(기본으로 만들어지지만 써놓아 주는게 좋음)
	Car1(){}

	public Car1(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

	double speedUp(double speed){
		speed++;
		return speed;
	}
	
	double speedDown(double speed){
		speed--;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드 : "+brand+"\n색상 : "+ color+"\n가격 : "+ price +"만원");
		//this가 생략 되어있음
		//System.out.println("브랜드 : "+this.brand+"\n색상 : "+ this.color+"\n가격 : "+ this.price +"만원");
	}
	
	public static void main(String[] args) {
		//객체화
		//인스턴스 변수
		//클래스명() : 기본 생성자
		//클래스를 선언하면 자동으로 선언되는 생성자
		
		Car1 momCar = new Car1(9000,"Black","Benz");
		momCar.showInfo();
		Car1 dadyCar = new Car1();
		Car1 myCar = new Car1();
		
		/*		
		momCar.brand = "Benz";
		momCar.color = "Black";
		momCar.price = 9000;
		
		momCar.showInfo();
		
		//momCar에는 주소값이 있다
		System.out.println(momCar);
		
		dadyCar.showInfo();
		*/
		
	}
	
}
