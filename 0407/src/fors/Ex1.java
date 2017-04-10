package fors;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 *  구구단을 2에서 9단까지 출력하는 프로그램을 작성하시오.
		 * */
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
			System.out.println();
		}
		
		
	}

}
