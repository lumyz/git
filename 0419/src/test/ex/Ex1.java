package test.ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		double width, area, height;

		Scanner scan = new Scanner(System.in);

		System.out.print("�ʺ� �Է��Ͻÿ� - > ");

		width = scan.nextDouble();

		System.out.print("���̸� �Է��Ͻÿ� - > ");

		height = scan.nextDouble();

		area = triangle(width, height);

		System.out.println("�Է��� ���� �ﰢ�� ���� - > " + area);

		scan.close();
	}

	private static double triangle(double width, double height) {
		// TODO Auto-generated method stub

		double area;

		area = width * height / 2;

		return area;

	}

}
