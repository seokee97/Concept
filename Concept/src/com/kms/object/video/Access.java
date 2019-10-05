package com.kms.object.video;

public class Access {
	int data1 = 10;

	// 다 사용가능
	public int data2 = 20;

	// 상송& 같은 패키지에서만 사용가능
	protected int data3 = 30;

	// 자신 class에서만 사용가능
	private int data4 = 40;

	// private를 다른 class에서도 사용하고싶을때
	// 값을 받을때
	public int getData4() {
		return data4;
	}

	//값을 넣을때	
	public void setData4(int data4) {
		this.data4 = data4;
	}


}

class Cloud {

	void function() {
		Access a = new Access();
		a.data1 = 10;
		a.data2 = 20;
		a.data3 = 30;
		
		a.getData4();
		System.out.println();
		a.setData4(40);
	}
}
