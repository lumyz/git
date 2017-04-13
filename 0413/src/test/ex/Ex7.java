package test.ex;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {

		String[] fruit = new String[] { "사과", "배", "수박", "토마토", "딸기", "참외" };
		
		Arrays.sort(fruit);
		
		for (int i = 0; i < fruit.length; i++) {
			System.out.print( fruit[i] + "  ");
		}
		
	}

}
