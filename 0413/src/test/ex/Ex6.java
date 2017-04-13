package test.ex;

import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {

		int[] num = new int[] {10, 45, 1, 3, 100, -10, 200, 5};
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		
	}

}
