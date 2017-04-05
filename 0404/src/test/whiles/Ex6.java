package test.whiles;

public class Ex6 {

	public static void main(String[] args) {
		
		int x = 0;
		
		while (x < 20) {
			
			System.out.print("@");
			x++;
			if ((x % 5) == 0) {
				System.out.print("\n");
			}
			
		}
		
	}

}
