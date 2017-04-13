package test.ex;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 		00 학교에서 국어, 영어, 수학 시험 점수가 아래와 같이 주어졌다.
		 * 		이름		국어	영어	수학
		 * 		강호동	80	85	56
		 * 		유재석	78	77	78
		 * 		신동엽	75	83	77	
		 * 		홍길동	90	78	80
		 * 		전지형	85	90	85
		 * 
		 * 		위에서 주어진 점수를 2차원 배열에 저장하고 위의 형식대로 출력하시오.( 이름 제외 )
		 * 		[단, 2차원 배열에서 각 1차원은 과목 점수 배열임]
		 * 
		 * 		
		 * 
		 */
			int[] sum = new int[] {0, 0, 0, 0, 0};
			double[] avg = new double[] {0, 0, 0, 0, 0};
			int[][] grade = new int[][] {
					{ 80, 78, 75, 90, 85 },
					{ 85, 77, 83, 78, 90 },
					{ 56, 78, 77, 80, 85 }
				};
				
			String[] strName = new String[] {"강호동", "유재석", "신동엽", "홍길동", "전지형"};

				for (int i = 0; i < grade[0].length; i++) {

					System.out.println( strName[i] + "   ");
					
					for (int j = 0; j < grade.length; j++) {
						System.out.print( grade[j][i] + "  ");
						sum[i] += grade[j][i]; 
					}
					
					avg[i] = (double)sum[i] / 3;
					
					System.out.printf("%d  %.2f", sum[i], avg[i]);
					
					System.out.println();
				}
				
	}

}
