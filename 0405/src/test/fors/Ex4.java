package test.fors;

public class Ex4 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0) {
				if (i % 10 != 0) {
					System.out.print(i + "\t");
				}
			}
		}
		
	}

}
