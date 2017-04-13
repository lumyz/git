package test.ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		String[] strName = new String[] { "김연아", "유재석", "송강호", "강호동", "설경구" };
		int[] group = new int[] { 1, 2, 3, 2, 3 };
		int num = 0;
		// ( a ) 아래와 같이 출력하시오.
		// 메뉴 : 1. 전체 	연예인, 2. 스포츠 스타, 3. 개그맨 4. 영화 배우 5. 끝내기
		
		Scanner scan = new Scanner(System.in);
		while (num != 5) {
			System.out.println("메뉴 : 1. 전체   연예인,   2. 스포츠 스타,   3. 개그맨   4. 영화 배우   5. 끝내기");
			
			num = scan.nextInt();
			
			if (num != 5) {
				for (int i = 0; i < group.length; i++) {
					
					switch (num) {
					case 1:
						System.out.print(strName[i] + "  ");
						break;

					case 5:
						
						break;
						
					default:
						if (group[i] + 1 == num) {
							System.out.print(strName[i] + "  ");
						}
						break;
					}
					
				}
				
				System.out.println();
				
			}
			
		}
		
		scan.close();
		
	}

}
