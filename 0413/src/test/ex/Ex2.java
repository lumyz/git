package test.ex;

public class Ex2 {

	public static void main(String[] args) {
		
		int[] num = new int[] {100, 123, -45, 56, 300, 250, 78, -256, 43, -145, 0};
		
		// ( a ) �����Ͱ� ����� �迭�� ����ϴ� ���α׷��� �ۼ��Ͻÿ� (��, 0�� ������ ���ڴ� ��ȣ�� ���� ��µǾ�� �Ѵ�.)
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > 0) {
				System.out.print("+" + num[i] + "  ");
			} else {
				System.out.print( num[i] + "  ");
			}
			
		}
		
		System.out.println();
		
		// ( b ) ������ �߿��� ����, ���, 0 �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
		
		System.out.println("�迭 �� ����� ���� : " + plus + "��");
		System.out.println("�迭 �� ������ ���� : " + minus + "��");
		System.out.println("�迭 �� 0�� ���� : " + zero + "��");
		
	}
	
}
