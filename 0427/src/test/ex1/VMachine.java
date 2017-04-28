package test.ex1;

import java.util.Scanner;

public class VMachine {

	Drink[] drinks;

	public VMachine(Drink[] drinks) {

		this.drinks = drinks;

	}

	public void printDrinkIndex() {

		Scanner scan = new Scanner(System.in);

		System.out.print("��ǰ ���� ] ");

		for (int i = 0; i < drinks.length; i++) {

			System.out.print(drinks[i].getNo() + ". " + drinks[i].getName() + "/" + drinks[i].getPrice() + "��  ");

		}

		System.out.println();

		int selectNum = scan.nextInt();
		scan.nextLine();

		printDrinkInfo(selectNum);

		scan.close();
	}

	public void printDrinkInfo(int selectNum) {

		Scanner scan = new Scanner(System.in);

		int insertValue = 0, goodsPrice = getPriceByNum(selectNum), variance;

		boolean calculationComple = false;

		while (!calculationComple) {

			System.out.println("[" + getNameByNum(selectNum) + "�� ���� �ϼ̽��ϴ�. �Ǹ� ������ " + goodsPrice + "���Դϴ�.]");

			System.out.print("�ݾ� ���� : ");

			insertValue = scan.nextInt();
			scan.nextLine();

			if (insertValue >= goodsPrice) {
				variance = insertValue - goodsPrice;
				System.out.println(getNameByNum(selectNum) + "�� �����ϼ̽��ϴ�. �Ǹ� �ܱ� " + variance + "���� ȸ�� �ϼ���.");

				calculationComple = !calculationComple;

			} else {
				System.out.println("���� �ݾ��� ���ڸ��ϴ�. �ٽ� �Է����ּ���.");
			}

		}

		scan.close();

	}

	private String getNameByNum(int i) {
		return drinks[i - 1].getName();
	}

	private int getPriceByNum(int i) {
		return drinks[i - 1].getPrice();
	}

}
