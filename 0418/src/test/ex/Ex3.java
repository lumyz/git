package test.ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		double width, area, height;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ʺ� �Է��Ͻÿ� - > ");
		
		width = scan.nextDouble();
		
		System.out.print("���̸� �Է��Ͻÿ� - > ");
		
		height= scan.nextDouble();
		
		area = rectangular(width, height);
		
		System.out.println("�Է��� ���� �簢�� ���� - > " + area);
		
	}

	private static double rectangular(double width, double height) {
		// TODO Auto-generated method stub
		
		double area;
		
		area = width * height;
		
		return area;
		
	}

}
