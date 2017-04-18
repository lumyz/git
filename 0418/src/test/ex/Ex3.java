package test.ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		double width, area, height;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("너비를 입력하시오 - > ");
		
		width = scan.nextDouble();
		
		System.out.print("높이를 입력하시오 - > ");
		
		height= scan.nextDouble();
		
		area = rectangular(width, height);
		
		System.out.println("입력한 값의 사각형 넓이 - > " + area);
		
	}

	private static double rectangular(double width, double height) {
		// TODO Auto-generated method stub
		
		double area;
		
		area = width * height;
		
		return area;
		
	}

}
