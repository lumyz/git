
public class Ex8 {

	public static void main(String[] args) {
		
		/*
		 *  1	2	3	4	5	6
		 *  7	8	9	10	11	12
		 *  13	14	15	16	17	18
		 * */
		
		for (int i = 0; i <= 2; i++) {
			
			for (int j = 1; j <= 6; j++) {
				
				System.out.printf("\t%2d" , (6 * i) + j);
				
				if (((6 * i) + j) % 6 == 0) {
					System.out.println();
				}
				
			}
			
		}
		
		/*
		 *  (0,0)	(0,1)	(0,2)	(0,3)	(0,4)	(0,5)
		 *	(1,0)	(1,1)	(1,2)	(1,3)	(1,4)	(1,5)
		 *	(2,0)	(2,1)	(2,2)	(2,3)	(2,4)	(2,5)
		 * */
		
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
