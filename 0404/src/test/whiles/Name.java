package test.whiles;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {

		String name;
		int x = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �̸��� 7�� ����ϴ� ���α׷�");
		
		System.out.print("�̸��� �Է��Ͻÿ� -> ");

		name = scan.nextLine();
		
		while (x <= 7) {
			System.out.println(name);
			x++;
		}
		
	}

}
