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
			System.out.println("이 삼각형은 정삼각형입니다.");
		} else {
			System.out.println("이 삼각형은 정삼각형이 아닙니다.");
		}
		
		scan.close();
		
	}

}
