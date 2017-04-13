package test.ex;

public class Ex5 {

	public static void main(String[] args) {

		int[][] num = new int[][] { { 11, 14, 39, 32, 44 }, { 33, 56, 78, 33, 45, 35, 90 } };
		
		System.out.print("{  ");
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num[i].length; j++) {
				
				System.out.print( num[i][j] + "  ");
				
			}
			
		}
		
		System.out.print("}");
		
	}

}
