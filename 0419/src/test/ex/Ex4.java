package test.ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int width, height;

		boolean judRectangular;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("�簢���� �ʺ� �Է��Ͻÿ� - > ");

		width = scan.nextInt();

		System.out.print("�簢���� ���̸� �Է��Ͻÿ� - > ");

		height = scan.nextInt();

		judRectangular = judgment(width, height);
		
		judPrint(judRectangular);
		
		scan.close();
	}

	private static void judPrint(boolean judRectangular) {
		if (judRectangular) {
			System.out.println("�ش� �簢���� ���簢���Դϴ�.");
		} else {
			System.out.println("�ش� �簢���� ���簢���� �ƴմϴ�.");
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
