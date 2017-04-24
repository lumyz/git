package test.ex;

public class Ex1 {

	public static void main(String[] args) {

		int[][] data = { { 34, 45, 66, 87, 20 }, { 89, 32, 45, 55, 90 } };

		print2D(data);
		
	}

	private static void print2D(int[][] data) {

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "   ");
			}
			System.out.println();
			
		}
		
	}

}
