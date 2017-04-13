package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * (a) 배열에 저장된 숫자 중에서 십자리 와 일자리가 같은 숫자만 출력하는 프로그램을 작성하시오.
		 */
		
		int[] num = new int[] { 34, 56, 78, 44, 98, 33, 65, 66, 76, 54, 44, 56, 11 };
		
		for (int i = 0; i < num.length; i++) {
			
			if ( num[i] % 11 == 0 ) {
				System.out.print(num[i] + "  ");
			}
			
		}
		
	}

}
