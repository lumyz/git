package test.fors;

public class Ex7 {

	public static void main(String[] args) {
		
		int endDay = 31;
		
		System.out.println("\t     2017��     1��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i = 1; i <= endDay; i++) {
			System.out.printf("%2d", i);
			
			if (i % 7 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}
		
		
	}

}
