package test.fors;

public class Ex8 {

	public static void main(String[] args) {
		
		/*
		 * [�Ǻ���ġ ����] �Ǻ���ġ �������� n ��° ���ڴ� ���� 2 ���� ���ڸ�
		 *  ���ؼ� ���� ����. �Ʒ��� �Ǻ���ġ ������ �Ϻθ� ���� �ְ� �ִ�.

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
