package test.ex;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * 		2명이 주문할 수 있는 가짓수를 구하라
		 * 		메뉴 짜장면 짬뽕 볶음밥 탕수육
		 * 		가격 4000 4000 6000 10000
		 * */
		
		String[] menu = new String[] {"짜장면", "짬뽕", "볶음밥", "탕수육"};
		int[] price = new int[] {4000, 4000, 6000, 10000};
		
		int numOfCase = 0, maxPrice = 15000, sumPrice, count = 0;
		
		for (int i = 0; i < menu.length; i++) {

			for (int j = 0; j < menu.length; j++) {
				numOfCase++;
				sumPrice = price[i] + price[j];
				System.out.println("사람1 : " + menu[i] + ", 사람2 : " + menu[j] + "   두 사람 메뉴의 총 가격 : " + sumPrice);
			
				if (sumPrice <= maxPrice) {
					count++;
				}
				
			}
		}
		
		System.out.println("두사람이 시킬 수 있는 메뉴 가짓수 : " + numOfCase);
		
		System.out.println("15000 이하의 식사비용인 경우 가짓수 : " + count);
	}

}
