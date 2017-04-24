package test.ex;

public class Ex2 {

	public static void main(String[] args) {

		double[][] grade = { { 98.4, 78, 65, 80, 85 }, { 88, 75, 80.5, 95, 76 }, { 75, 77, 94, 90, 65 } };

		double schoolGradeAvg = schoolAvg(grade);

		double[] classGradeAvg = classAvg(grade);

		System.out.println(schoolGradeAvg);
		
		for (int i = 0; i < classGradeAvg.length; i++) {
			System.out.println(classGradeAvg[i]);
		}

	}

	private static double[] classAvg(double[][] grade) {

		double[] classGradeAvg = { 0, 0, 0 }, classGradeSum = { 0, 0, 0 };

		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				classGradeSum[i] += grade[i][j];
			}
			classGradeAvg[i] = classGradeSum[i] / grade[i].length;
		}

		return classGradeAvg;
	}

	private static double schoolAvg(double[][] grade) {

		double schoolGradeAvg, schoolGradeSum = 0;

		int schoolNumOfPeople = grade.length * grade[0].length;

		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				schoolGradeSum += grade[i][j];
			}
		}

		schoolGradeAvg = schoolGradeSum / schoolNumOfPeople;

		return schoolGradeAvg;

	}

}
