package test.ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		double width, area, height;

		Scanner scan = new Scanner(System.in);

		System.out.print("너비를 입력하시오 - > ");

		width = scan.nextDouble();

		System.out.print("높이를 입력하시오 - > ");

		height = scan.nextDouble();

		area = triangle(width, height);

		System.out.println("입력한 값의 삼각형 넓이 - > " + area);

		scan.close();
	}

	private static double triangle(double width, double height) {
		// TODO Auto-generated method stub

		double area;

		area = width * height / 2;

		return area;

	}

}
