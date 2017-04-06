import java.util.Scanner;

public class Ex3 {
	
	/*
	 * 자신의 개인정보를 출력하는 프로그램을 작성하시오.
	 * 단, 아래와 같이 프로그램이 동작해야함
	 * 
	 * (1) 아래와 같은 메뉴를 출력함
	 * 	메뉴] 	1. 이름	 2. 취미 	3. 좋아하는 영화	4. 종료
	 * 
	 * (2) 위의 메뉴 출력과 선택은 계속 반복이 되고... 
	 * 4 메뉴를 선택하면 반복이 종료됨
	 * 
	 * (3) 1 메뉴를 선택하면... 이름을 출력함
	 *     2 메뉴를 선택하면... 취미를 출력함
	 *     3 메뉴를 선택하면... 좋아하는 영화를 출력함
	 *     4 메뉴를 선택하면... 종료
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sellect;
		
		boolean endType = true;
		
		while (endType) {
						
			System.out.println("메뉴]  1. 이름	 2. 취미 	3. 좋아하는 영화	4. 종료");
			System.out.print("선택] ");
			
			sellect = scan.nextInt();
			
			switch (sellect) {
			case 1:
				System.out.println("이름 : 김영환");
				break;

			case 2:
				System.out.println("취미 : IT기사 읽기");
				break;
				
			case 3:
				System.out.println("좋아하는 영화 : 반지의제왕");
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				endType = false;
				break;
				
			}
				
		}
		
		
		scan.close();
	}
}
