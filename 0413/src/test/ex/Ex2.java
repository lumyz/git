package test.ex;

public class Ex2 {

	public static void main(String[] args) {
		
		int[] num = new int[] {100, 123, -45, 56, 300, 250, 78, -256, 43, -145, 0};
		
		// ( a ) 데이터가 저장된 배열을 출력하는 프로그램을 작성하시오 (단, 0을 제외한 숫자는 부호도 같이 출력되어야 한다.)
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > 0) {
				System.out.print("+" + num[i] + "  ");
			} else {
				System.out.print( num[i] + "  ");
			}
			
		}
		
		System.out.println();
		
		// ( b ) 데이터 중에서 음수, 양수, 0 의 갯수를 출력하는 프로그램을 작성하시오.
		
		int minus = 0, plus = 0, zero = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > 0) {
				plus++;
			} else if (num[i] < 0) {
				minus++;
			} else {
				zero++;				
			}
			
		}
		
		System.out.println("배열 중 양수의 갯수 : " + plus + "개");
		System.out.println("배열 중 음수의 갯수 : " + minus + "개");
		System.out.println("배열 중 0의 갯수 : " + zero + "개");
		
	}
	
}
