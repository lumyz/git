package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		String[] str_GoodsName = new String[] {"�ϳ��� ��Ʈ", "���� �Ϸ���", "�̴Ͻ���", "GS25", "CU"};
		int[] price = new int[] {1000, 900, 800, 1200, 1000};
		
		int index = 0, min = price[0];
		
		for (int i = 1; i < price.length; i++) {
			
			if (min > price[i]) {
				min = price[i];
				index = i;
			}
			
		}
		
		System.out.println("���� ������ ������ ������ : " + str_GoodsName[index]);
		System.out.println("���� ������ ������ ���� : " + min);
		
	}

}
