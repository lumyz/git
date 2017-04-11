package test.ex;

public class Ex2 {

	public static void main(String[] args) {
		
		double[] score = new double[]{100};
		
		System.out.println("배열 score의 길이 : " + score.length);
		
		for (int i = 0; i < score.length; i++) {
			// 배열의 length는 배열에 포함된 방의 갯수
			
			System.out.println(score[i]);
		}

	}

}
