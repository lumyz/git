package fors;

public class Ex7 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i * 500 + j * 100 == 1500) {
					System.out.println("(500원" + i + "개, 100원" + j + "개)");
				}
			}
		}
		
	}

}
