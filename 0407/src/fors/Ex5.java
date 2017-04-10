package fors;

public class Ex5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				
				if (i - j == 3 || j - i == 3) {
					System.out.println("(" + i + "," + j + ")");
				}
				
			}
		}
		
	}

}
