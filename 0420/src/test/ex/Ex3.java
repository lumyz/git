package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		int[] data = new int[] { 1, 2, 3, 4, 5, 6 };

		printValue(data);

	}

	private static void printValue(int[] data) {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}

	}

}
