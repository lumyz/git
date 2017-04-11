package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		String[] str_GoodsName = new String[] {"하나로 마트", "세븐 일레븐", "미니스톱", "GS25", "CU"};
		int[] price = new int[] {1000, 900, 800, 1200, 1000};
		
		int index = 0, min = price[0];
		
		for (int i = 1; i < price.length; i++) {
			
			if (min > price[i]) {
				min = price[i];
				index = i;
			}
			
		}
		
		System.out.println("가장 저렴한 우유의 편의점 : " + str_GoodsName[index]);
		System.out.println("가장 저렴한 우유의 가격 : " + min);
		
	}

}
