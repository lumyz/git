package test.ex;

public class Ex1 {

	public static void main(String[] args) {

		int[][] data = new int[][] { { 10, 20, 30, 40, 50 }, { 110, 120, 130, 140, 150 } };
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] += (i + 1) * j;
			}
			
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
