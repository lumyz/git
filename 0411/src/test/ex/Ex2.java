package test.ex;

public class Ex2 {

	public static void main(String[] args) {
		
		// ���� ������ �迭 ����
		int[] data = new int[]{70, 85, 60, 90, 95, 75};
		
		// ���� ù �迭 ���� ���� max���� �־ �񱳸� ����
		int max = data[0];
		
		// ���� ū ���� �ε����� ������ ���� ����
		int index = 0;
		
		// max���� �������� �迭���� �񱳸� ���� ���� �� ũ��
		// �� ���� max������ �����Ͽ� �� ������ �� ū���� ã��
		for (int i = 1; i < data.length; i++) {
			
			if (max < data[i]) { 						
				max = data[i];							
				index = i;
			}
			
		}
		
		System.out.println("���� ū ����  : " + max);
		System.out.println("���� ū ���� �ε��� : " + index);
		
	}
	
}
