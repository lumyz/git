
public class Ex2 {

	/*
	 * 1���� 1000 ������ ���� �߿��� ���� ū 13�� ����� ���Ͻÿ�
	 * */	
	public static void main(String[] args) {
		
		int max13 = 0;
		
		for (int i = 1000; i >= 1; i--) {
			
			if (i % 13 == 0) {
				
				max13 = i;
				
				break;
			}
			
		}
		
		System.out.println("1���� 1000 ������ ���� �߿��� ���� ū 13�� ����� :" + max13);
		
	}

}
