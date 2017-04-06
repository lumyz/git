
public class Ex5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.print(i);
			
			if (i % 2 == 0 && i != 100) {
				System.out.print(" + ");
			} else if (i % 2 == 1) {
				System.out.print(" - ");
			}
			
		}
		
	}

}
