package test.whiles;

public class Num {

	public static void main(String[] args) {
		int x = 0;
		final int five = 5;
		
		System.out.println("0에서 5씩 증가하여 30까지 출력");
		
		while (x >= 6) {
			System.out.print(x * five + "\t");
			x++;
		}
	}

}
