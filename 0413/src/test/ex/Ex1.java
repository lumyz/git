package test.ex;

public class Ex1 {

	public static void main(String[] args) {

		int[] num = new int[21];
		
		for (int i = 0; i < 21; i++) {
			num[i] = (i - 10) ;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		
	}

}
