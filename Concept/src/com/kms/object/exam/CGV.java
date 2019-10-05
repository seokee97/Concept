package com.kms.object.exam;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "★어서오세요 CGV입니다.★\n";
		String menuMsg = "①예매하기\n②구매하기\n③포인트 조회\n④나가기\n";
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		String films = "①라이온킹(08:00)\n②스파이더맨(12:00)\n③사일런스(23:00)[청소년 관람 불가]\n④뒤로가기\n";
		String product = "①팝콘\n②콜라\n③맥주\n④뒤로가기\n";
		int p_price = 0;
		int choice = 0;
		int age = 0;
		int money = 1_000_000_000;
		int point = 0;
		int t_price = 10000;
		boolean t_check;
		boolean p_check;
		/*
		 * 구매하기 1.팝콘 2.콜라 3.맥주 4. 뒤로가기
		 */
		while (true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			if (choice == 4) {
				break;
			}
			// 잘못입력했을때 continue
			if (!(choice == 1 || choice == 2 || choice == 3)) {
				continue;
			}
			switch (choice) {
			// 예매하기 영역
			case 1:
				// 변수의 재사용
				if (money - t_price < 0) { // 빼서 음수일때가 더 정확!!(money <t_price -> 오류 날수 있음)
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
					continue;
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if (choice == 1) {
					JOptionPane.showMessageDialog(null, "라이온킹 예매 완료(08:00)");
				} else if (choice == 2) {
					JOptionPane.showMessageDialog(null, "스파이터맨 예매 완료(12:00)");
				} else if (choice == 3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if (age > 19) {
						JOptionPane.showMessageDialog(null, "사일런스 예매 완료(23:00)");
					} else {
						JOptionPane.showMessageDialog(null, "다시 시도해 주세요");
					}

				} else {
					t_check = false;
					JOptionPane.showMessageDialog(null, "메인 메뉴로 이동합니다.");
					continue;
				}
				if (t_check) {
					if (point > 0) {
						if (point - t_price >= 0) {
							point -= t_price;
						} else {
							money -= (t_price - point);
							point = 0;
						}
					} else {
						money -= t_price;
						point += (int) (t_price * 0.5);
					}
					JOptionPane.showMessageDialog(null, "현재 잔액 : " + money + "원");
				}

				break;
			// 구매하기 영역
			case 2:
			/*
			 	if (money - p_price < 0) {
			
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
					continue;
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(product));
				if(choice ==1) {
					JOptionPane.showMessageDialog(null, "팝콘이 구매되었습니다.");
				}else if(choice ==2) {
					JOptionPane.showMessageDialog(null, "콜라가 구매되었습니다.");
				}else if(choice ==3) {
					JOptionPane.showMessageDialog(null, "맥주가 구매되었습니다.");
				}else {
					p_check = false;
					JOptionPane.showMessageDialog(null, "메인 메뉴로 이동합니다.");
					continue;
				}
				if(p_check) {
					if(point>0) {
						if(point - p_price>=0) {
							point -=p_price;
						}else {
							money -= (p_price - point);
							point = 0;
						}
					} else {
						money -= p_price;
						point += (int) (p_price * 0.5);
					}
					JOptionPane.showMessageDialog(null, "현재 잔액 : " + money + "원");
				}
					
				*/
					break;
				// 포인트 조회 영역
			case 3:
				JOptionPane.showMessageDialog(null, "잔여 포인트 : " + point + "점");
				break;
			}
		}

	}
}
