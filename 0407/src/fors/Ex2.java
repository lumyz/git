package fors;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 *  �������� ������ 2���� 9�ܱ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
