package test.ex;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * 		2���� �ֹ��� �� �ִ� �������� ���϶�
		 * 		�޴� ¥��� «�� ������ ������
		 * 		���� 4000 4000 6000 10000
		 * */
		
		String[] menu = new String[] {"¥���", "«��", "������", "������"};
		int[] price = new int[] {4000, 4000, 6000, 10000};
		
		int numOfCase = 0, maxPrice = 15000, sumPrice, count = 0;
		
		for (int i = 0; i < menu.length; i++) {

			for (int j = 0; j < menu.length; j++) {
				numOfCase++;
				sumPrice = price[i] + price[j];
				System.out.println("���1 : " + menu[i] + ", ���2 : " + menu[j] + "   �� ��� �޴��� �� ���� : " + sumPrice);
			
				if (sumPrice <= maxPrice) {
					count++;
				}
				
			}
		}
		
		System.out.println("�λ���� ��ų �� �ִ� �޴� ������ : " + numOfCase);
		
		System.out.println("15000 ������ �Ļ����� ��� ������ : " + count);
	}

}
