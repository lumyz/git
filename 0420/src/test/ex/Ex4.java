package test.ex;

public class Ex4 {

	public static void main(String[] args) {

		int[] grade = { 90, 98, 80, 85, 70, 75 };
		
		int result = gradeAvgPrint(grade);

		System.out.println(result);
		
	}

	private static int gradeAvgPrint(int[] grade) {

		int sum = 0;
		
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}
		
		int result = sum / grade.length;
		
		return result;
		
	}

}
