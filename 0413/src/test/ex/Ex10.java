package test.ex;

import java.util.Scanner;

public class Ex10 {

	static String[] strStore = { "�ϳ��� ��Ʈ", "�ູ�� ��Ʈ", "�� ���� ��Ʈ", "���� �Ϸ���" };
	static String[] strFruite = { "�丶��", "����", "����", "����" };
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
		
		System.out.println("�޴�] 1. ��Ʈ�� �Ǹ� �ü�   2.  ǰ�� �Ǹ� �ü�   3. ������ �ü� ����  4. �����ϱ�");
		
		selectNum = scan.nextInt();
		
		switch (selectNum) {
		case 1:
			System.out.println("��Ʈ�� �Ǹ� �ü�] 1. �ϳ��� ��Ʈ   2. �ູ�� ��Ʈ   3. �� ���� ��Ʈ   4. ���� �Ϸ���");
			
			selectNum1 = scan.nextInt();
			
			oneSelect();
			
			break;

		case 2:
			System.out.println("ǰ�� �Ǹ� �ü�] 1. �丶��  2. ����  3. ����  4. ����");

			selectNum1 = scan.nextInt();
			
			twoSelect();
			
			break;
			
		case 3:
			System.out.println("ǰ�� ������ �ü�]");
			
			threeSelect();
			
			break;
			
		case 4:
			System.out.println("���α׷��� �����մϴ�.");
			scan.close();
			break;
			
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		
	}

	private static void threeSelect() {

		System.out.print("\tǰ��        ������       �Ǹ� ��Ʈ");
		
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.print( strFruite[selectNum1 - 1] + " : ");
			
			for (int i = 0; i < fruitPrice.length; i++) {
				
				if (strStore[i].equals(strStore[selectNum1 - 1])) {
					for (int j = 0; j < fruitPrice[i].length; j++) {
						
						System.out.print( strStore[j] + " "  + fruitPrice[i][j] + "��, ");
						
					}
				}
			}
		
			System.out.println("\n");
		}
		
		selectNum1 = 0;
		
	}

	private static void oneSelect() {
		
		if (selectNum1 < 1 && selectNum1 > 4) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.print( strStore[selectNum1 - 1] + " : ");
			
			for (int i = 0; i < fruitPrice.length; i++) {
				
				if (strStore[i].equals(strStore[selectNum1 - 1])) {
					for (int j = 0; j < fruitPrice[i].length; j++) {
						
						System.out.print( strFruite[j] + " "  + fruitPrice[j][i] + "��, ");
						
					}
				}
			}
		
			System.out.println("\n");
		}
		
		selectNum1 = 0;
			
	}

	private static void fruitPriceMenuPrint() {
		
		System.out.print("\t�Ǹ�ó  ");
		
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
