package test.ex;

public class Ex1 {

	public static void main(String[] args) {
		
		double[] score = new double[5];
		
		score[0] = 90.5;
		score[1] = 67.55;
		score[2] = 55.5;
		score[3] = 90;
		score[4] = 80;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "  ");
		}
		
	}

}
