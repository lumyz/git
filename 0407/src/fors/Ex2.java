package fors;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 *  구구단을 옆으로 2에서 9단까지 출력하는 프로그램을 작성하시오.
		 * */
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 2; j <= 9; j++) {
				
				System.out.print(j + " * " + i + " = " + i * j);
					
				if (j != 9) {
					System.out.print("\t");
				} else {
					System.out.println();
				}
				
			}
		
			
		}
		
	}

}
