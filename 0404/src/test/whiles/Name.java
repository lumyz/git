package test.whiles;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {

		String name;
		int x = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("내 이름을 7번 출력하는 프로그램");
		
		System.out.print("이름을 입력하시오 -> ");

		name = scan.nextLine();
		
		while (x <= 7) {
			System.out.println(name);
			x++;
		}
		
	}

}
