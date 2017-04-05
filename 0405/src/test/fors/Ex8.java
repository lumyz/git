package test.fors;

public class Ex8 {

	public static void main(String[] args) {
		
		/*
		 * [피보나치 수열] 피보나치 수열에서 n 번째 숫자는 앞의 2 개의 숫자를
		 *  더해서 구해 진다. 아래는 피보나치 수열의 일부를 보여 주고 있다.

		 * */
		
		int C = 1, max = 100, A = 1, B = 1;
		
		System.out.print(A + ", ");
		
		for (int i = 0; i <= max; i++) {
			
			System.out.print(C + ", ");
			
			C = A + B;
			
			A = B;
			
			B = C;
			
		}
		
	}
}
