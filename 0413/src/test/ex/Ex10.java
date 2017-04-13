package test.ex;

import java.util.Scanner;

public class Ex10 {

	static String[] strStore = { "하나로 마트", "행복한 마트", "더 좋은 마트", "세븐 일레븐" };
	static String[] strFruite = { "토마토", "참외", "수박", "우유" };
	static int[][] fruitPrice = { { 500, 400, 300, 600 }, { 1000, 900, 1200, 1500 }, { 10000, 9000, 8000, 7000 }, { 1000, 800, 1200, 900 } };
	
	static int selectNum = 0, selectNum1 = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (selectNum != 3) {
			
			fruitPriceMenuPrint();
			
			firstQuestionMenu();
			
		}
		
	}

	private static void firstQuestionMenu() {
		
		System.out.println("메뉴] 1. 마트별 판매 시세   2.  품목별 판매 시세   3. 최저가 시세 보기  4. 종료하기");
		
		selectNum = scan.nextInt();
		
		switch (selectNum) {
		case 1:
			System.out.println("마트별 판매 시세] 1. 하나로 마트   2. 행복한 마트   3. 더 좋은 마트   4. 세븐 일레븐");
			
			selectNum1 = scan.nextInt();
			
			oneSelect();
			
			break;

		case 2:
			System.out.println("품목별 판매 시세] 1. 토마토  2. 참외  3. 수박  4. 우유");

			selectNum1 = scan.nextInt();
			
			twoSelect();
			
			break;
			
		case 3:
			System.out.println("품목별 최저가 시세]");
			
			threeSelect();
			
			break;
			
		case 4:
			System.out.println("프로그램을 종료합니다.");
			scan.close();
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
	}

	private static void threeSelect() {

		System.out.print("\t품목        최저가       판매 마트");
		
		System.out.println();
		
		int[] priceMin = { fruitPrice[0][0], fruitPrice[1][0], fruitPrice[2][0], fruitPrice[3][0] };
		
		String[] martMin = new String[4];
		
		for (int i = 0; i < fruitPrice.length; i++) {
			
			for (int j = 0; j < fruitPrice[i].length; j++) {
				
				if (priceMin[i] >= fruitPrice[i][j]) {
					
					priceMin[i] = fruitPrice[i][j];
					
					martMin[i] = strStore[j];
				
				}
				
			}
			
		}
		
		for (int i = 0; i < fruitPrice.length; i++) {

			System.out.print(strFruite[i] + "  " + priceMin[i] + "   " + martMin[i]);
		
			System.out.println();
		}
		
	}

	private static void twoSelect() {
		
		if (selectNum1 < 1 && selectNum1 > 4) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.print( strFruite[selectNum1 - 1] + " : ");
			
			for (int i = 0; i < fruitPrice.length; i++) {
				
				if (strStore[i].equals(strStore[selectNum1 - 1])) {
					for (int j = 0; j < fruitPrice[i].length; j++) {
						
						System.out.print( strStore[j] + " "  + fruitPrice[i][j] + "원, ");
						
					}
				}
			}
		
			System.out.println("\n");
		}
		
		selectNum1 = 0;
		
	}

	private static void oneSelect() {
		
		if (selectNum1 < 1 && selectNum1 > 4) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.print( strStore[selectNum1 - 1] + " : ");
			
			for (int i = 0; i < fruitPrice.length; i++) {
				
				if (strStore[i].equals(strStore[selectNum1 - 1])) {
					for (int j = 0; j < fruitPrice[i].length; j++) {
						
						System.out.print( strFruite[j] + " "  + fruitPrice[j][i] + "원, ");
						
					}
				}
			}
		
			System.out.println("\n");
		}
		
		selectNum1 = 0;
			
	}

	private static void fruitPriceMenuPrint() {
		
		System.out.print("\t판매처  ");
		
		for (int i = 0; i < strFruite.length; i++) {
			System.out.printf("%5s", strFruite[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < strStore.length; i++) {
			System.out.printf( "%8s", strStore[i] );
			for (int j = 0; j < fruitPrice[i].length; j++) {
				System.out.printf( "  %5d", fruitPrice[j][i] );
			}
			System.out.println();
		}
		
	}

}
