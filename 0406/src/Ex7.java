
public class Ex7 {

	public static void main(String[] args) {

		double sum = 0;
		
		for (int i = 1; i < 100; i++) {
			
			if (i % 2 == 1) {
				sum -= (double)i / (double)(i + 1); 
			} else {
				sum += (double)i / (double)(i + 1);
			}
			
		}
		
		System.out.println(sum);
		
	}

}
