package test.ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int width, height;

		boolean judRectangular;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("사각형의 너비를 입력하시오 - > ");

		width = scan.nextInt();

		System.out.print("사각형의 높이를 입력하시오 - > ");

		height = scan.nextInt();

		judRectangular = judgment(width, height);
		
		judPrint(judRectangular);
		
		scan.close();
	}

	private static void judPrint(boolean judRectangular) {
		if (judRectangular) {
			System.out.println("해당 사각형은 정사각형입니다.");
		} else {
			System.out.println("해당 사각형은 정사각형이 아닙니다.");
		}
	}

	private static boolean judgment(int width, int height) {

		boolean result = false;
		
		if (width == height) {
			result = true;
		}
		
		return result;
	}

}
