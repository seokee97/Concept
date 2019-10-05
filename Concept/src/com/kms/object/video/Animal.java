package com.kms.object.video;
//강아지, 고양이 돼지

//생성자를 사용해서 초기화 하기
//생성자 단축키 : Alt + Shift + s > o

public class Animal {
	String name;
	int age;
	double weight;
	String feed;
	String sound;
	
	public Animal() {}

	public Animal(String name, int age, double weight, String feed, String sound) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feed = feed;
		this.sound = sound;
	}

	void getsounds(){
		System.out.println(sound);
	}
	
	void eat() {
		System.out.println(name + "이(가)"+ feed +"을(를) 먹는중.");
	}

	void sleep() {
		System.out.println(name + "이(가) 자는 중");
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal pig = new Animal("배꼽",4,35.2,"곡식","꿀꿀");
		
		pig.eat();
		pig.getsounds();
		pig.sleep();
	}

}
