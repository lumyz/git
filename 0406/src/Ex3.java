import java.util.Scanner;

public class Ex3 {
	
	/*
	 * �ڽ��� ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ��, �Ʒ��� ���� ���α׷��� �����ؾ���
	 * 
	 * (1) �Ʒ��� ���� �޴��� �����
	 * 	�޴�] 	1. �̸�	 2. ��� 	3. �����ϴ� ��ȭ	4. ����
	 * 
	 * (2) ���� �޴� ��°� ������ ��� �ݺ��� �ǰ�... 
	 * 4 �޴��� �����ϸ� �ݺ��� �����
	 * 
	 * (3) 1 �޴��� �����ϸ�... �̸��� �����
	 *     2 �޴��� �����ϸ�... ��̸� �����
	 *     3 �޴��� �����ϸ�... �����ϴ� ��ȭ�� �����
	 *     4 �޴��� �����ϸ�... ����
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sellect;
		
		boolean endType = true;
		
		while (endType) {
						
			System.out.println("�޴�]  1. �̸�	 2. ��� 	3. �����ϴ� ��ȭ	4. ����");
			System.out.print("����] ");
			
			sellect = scan.nextInt();
			
			switch (sellect) {
			case 1:
				System.out.println("�̸� : �迵ȯ");
				break;

			case 2:
				System.out.println("��� : IT��� �б�");
				break;
				
			case 3:
				System.out.println("�����ϴ� ��ȭ : ����������");
				break;
				
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				endType = false;
				break;
				
			}
				
		}
		
		
		scan.close();
	}
}
