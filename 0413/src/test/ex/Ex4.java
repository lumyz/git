package test.ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		String[] strName = new String[] { "�迬��", "���缮", "�۰�ȣ", "��ȣ��", "���汸" };
		int[] group = new int[] { 1, 2, 3, 2, 3 };
		int num = 0;
		// ( a ) �Ʒ��� ���� ����Ͻÿ�.
		// �޴� : 1. ��ü 	������, 2. ������ ��Ÿ, 3. ���׸� 4. ��ȭ ��� 5. ������
		
		Scanner scan = new Scanner(System.in);
		while (num != 5) {
			System.out.println("�޴� : 1. ��ü   ������,   2. ������ ��Ÿ,   3. ���׸�   4. ��ȭ ���   5. ������");
			
			num = scan.nextInt();
			
			if (num != 5) {
				for (int i = 0; i < group.length; i++) {
					
					switch (num) {
					case 1:
						System.out.print(strName[i] + "  ");
						break;

					case 5:
						
						break;
						
					default:
						if (group[i] + 1 == num) {
							System.out.print(strName[i] + "  ");
						}
						break;
					}
					
				}
				
				System.out.println();
				
			}
			
		}
		
		scan.close();
		
	}

}
