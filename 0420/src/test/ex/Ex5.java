package test.ex;

public class Ex5 {

	public static void main(String[] args) {

		double[] values1 = { 0.1, 0.2, 10, 20, 30 }, values2 = { 1, 2, 3, 4, 5, 6 };
		
		double[] result = arrayCat(values1, values2);

		for (int i = 0; i < result.length; i++) {
			System.out.printf("%.1f   ", result[i]);
		}
		
	}

	private static double[] arrayCat(double[] values1, double[] values2) {
		
		int lenValues = values1.length + values2.length;
		
		double[] result = new double[lenValues];
		
		System.arraycopy(values1, 0, result, 0, values1.length);
		
		System.arraycopy(values2, 0, result, values1.length, values2.length);
		
		return result;
		
	}

}
