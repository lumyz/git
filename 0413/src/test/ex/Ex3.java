package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * (a) �迭�� ����� ���� �߿��� ���ڸ� �� ���ڸ��� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		int[] num = new int[] { 34, 56, 78, 44, 98, 33, 65, 66, 76, 54, 44, 56, 11 };
		
		for (int i = 0; i < num.length; i++) {
			
			if ( num[i] % 11 == 0 ) {
				System.out.print(num[i] + "  ");
			}
			
		}
		
	}

}
