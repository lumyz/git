package test.whiles;

public class Ex4 {

	public static void main(String[] args) {

		int value = -5;
		
		System.out.println("-5���� 5���� ���ʷ� ���");
		
		while (value <= 5) {
			
			if (value < 0) {
				System.out.print(value * -1 + "\t");
			} else {
				System.out.print(value + "\t");
			}
			
			value++;
		}
		
	}

}
