package test.ex1;

import java.util.Scanner;

public class VMachine {

	Drink[] drinks;

	public VMachine(Drink[] drinks) {

		this.drinks = drinks;

	}

	public void printDrinkIndex() {

		Scanner scan = new Scanner(System.in);

		System.out.print("제품 선택 ] ");

		for (int i = 0; i < drinks.length; i++) {

			System.out.print(drinks[i].getNo() + ". " + drinks[i].getName() + "/" + drinks[i].getPrice() + "원  ");

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

			System.out.println("[" + getNameByNum(selectNum) + "를 선택 하셨습니다. 판매 가격은 " + goodsPrice + "원입니다.]");

			System.out.print("금액 투입 : ");

			insertValue = scan.nextInt();
			scan.nextLine();

			if (insertValue >= goodsPrice) {
				variance = insertValue - goodsPrice;
				System.out.println(getNameByNum(selectNum) + "를 구매하셨습니다. 판매 잔금 " + variance + "원을 회수 하세요.");

				calculationComple = !calculationComple;

			} else {
				System.out.println("투입 금액이 모자릅니다. 다시 입력해주세요.");
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
