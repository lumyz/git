package test.fors;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int danNum;
		
		System.out.println("------ 구구단 출력 프로그램 ------");
		
		System.out.print("출력할 구구단의 단수를 입력하시오 - > ");
		
		Scanner scan = new Scanner(System.in);
		
		danNum = scan.nextInt();
		
		for (int i = 1; i <= 9; i++ ) {
			System.out.println(danNum + " * " + i + " = " + danNum * i);
		}
		
		scan.close();
	}

}
