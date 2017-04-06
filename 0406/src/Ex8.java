
public class Ex8 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 18; i++) {
			
			System.out.print(i);
			
			if (i % 6 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
			
		}
		
		for (int i = 0; i <= 2; i++) {
			
			for (int j = 0; j <= 5; j++) {
				
				System.out.print("(" + i + "," + j + ")");
				
				if (j % 5 == 0 && j != 0) {
					
					System.out.print("\n");
					
				} else {
					
					System.out.print("\t");
					
				}
				
			}
			
		}
		
	}

}
