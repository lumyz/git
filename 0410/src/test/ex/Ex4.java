package test.ex;

public class Ex4 {

	public static void main(String[] args) {

		double[] engGrade = new double[] {88.5, 85, 77.65, 70, 90, 66, 90, 65};
		String[] studentName = new String[] {"강호동", "유재석", "신동엽", "김연아", "송강호", "전지현", "김하늘", "송윤아"};
		
		double sum = 0, avg;
		
		for (int i = 0; i < engGrade.length; i++) {
			sum += engGrade[i];
			
			System.out.println("  " + (i + 1) + "  " + studentName[i] + "  " + engGrade[i]);
		}
		
		avg = sum / engGrade.length;
		
		System.out.println("영어 총합 : " + sum);
		System.out.println("영어 평균 : " + avg);
		
	}

}
