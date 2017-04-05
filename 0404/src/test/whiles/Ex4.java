package test.whiles;

public class Ex4 {

	public static void main(String[] args) {

		int value = -5;
		
		System.out.println("-5부터 5까지 차례로 출력");
		
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
