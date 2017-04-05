package test.fors;

public class Ex7 {

	public static void main(String[] args) {
		
		int endDay = 31;
		
		System.out.println("\t     2017년     1월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
