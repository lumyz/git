package test.whiles;

public class Ex5 {

	public static void main(String[] args) {
		
		int x = 1, value = 0;
		
		while (x <= 13) {
			
			System.out.print(value + "\t");
			value += x;
			x = x + 2;
		}
		
	}

}
