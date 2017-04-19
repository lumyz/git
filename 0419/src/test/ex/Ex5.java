package test.ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int A, B, C;

		boolean judTriangle;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("�ﰢ���� �� ������ ���ʷ� �Է��Ͻÿ� (Enter ����)");

		A = scan.nextInt();

		B = scan.nextInt();

		C = scan.nextInt();
		
		if (valueCheck(A, B, C)) {
			judTriangle = judgment(A, B, C);
			
			judPrint(judTriangle);
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
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
			System.out.println("�ش� �ﰢ���� ���ﰢ���Դϴ�.");
		} else {
			System.out.println("�ش� �ﰢ���� ���ﰢ���� �ƴմϴ�.");
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
