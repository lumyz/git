package test.andor;

import java.util.Scanner;

public class And {

	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A ?");
		A = scan.nextInt();
		
		System.out.print("B ?");
		B = scan.nextInt();
		
		System.out.print("C ?");
		C = scan.nextInt();
		
		if (A == 60 && B == 60 && C == 60) {
			System.out.println("�� �ﰢ���� ���ﰢ���Դϴ�.");
		} else {
			System.out.println("�� �ﰢ���� ���ﰢ���� �ƴմϴ�.");
		}
		
		scan.close();
		
	}

}
