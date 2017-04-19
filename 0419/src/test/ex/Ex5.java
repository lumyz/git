package test.ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int A, B, C;

		boolean judTriangle;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("삼각형의 각 내각을 차례로 입력하시오 (Enter 구분)");

		A = scan.nextInt();

		B = scan.nextInt();

		C = scan.nextInt();
		
		if (valueCheck(A, B, C)) {
			judTriangle = judgment(A, B, C);
			
			judPrint(judTriangle);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		scan.close();
	}

	private static boolean valueCheck(int a, int b, int c) {

		boolean result = false;
		
		if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
			result = true;
		}

		return result;
	}

	private static void judPrint(boolean judTriangle) {
		if (judTriangle) {
			System.out.println("해당 삼각형은 정삼각형입니다.");
		} else {
			System.out.println("해당 삼각형은 정삼각형이 아닙니다.");
		}
	}

	private static boolean judgment(int A, int B, int C) {

		boolean result = false;
		
		if (A == 60 && B == 60 && C == 60) {
			result = true;
		}
		
		return result;
	}

}
