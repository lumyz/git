package test.fors;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int danNum;
		
		System.out.println("------ ������ ��� ���α׷� ------");
		
		System.out.print("����� �������� �ܼ��� �Է��Ͻÿ� - > ");
		
		Scanner scan = new Scanner(System.in);
		
		danNum = scan.nextInt();
		
		for (int i = 1; i <= 9; i++ ) {
			System.out.println(danNum + " * " + i + " = " + danNum * i);
		}
		
		scan.close();
	}

}
