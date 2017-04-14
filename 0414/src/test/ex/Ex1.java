package test.ex;

public class Ex1 {
	
	static double[][] grade = {
			{ 84.55, 89.67, 77.43, 56.98, 89.23 },
			{ 77.32, 88.98, 56.78, 76, 67.5 },
			{ 45.5, 90.23, 54.56, 75.5, 50 },
			{ 67, 65.8, 90, 86, 85 } 
	};
	
	static String[] name = { "강호동", "유재석", "박수홍", "김건모", "이경재" };
	static String[] subject = { "국어", "영어", "수학", "미술", "총점", "평균" };
	static double[] sum = { 0, 0, 0, 0, 0 };
	static int[] rank = { 1, 1, 1, 1, 1};
	static double[] avg = { 0,0,0,0,0 };
	
	public static void main(String[] args) {
		
		tablePrint();
		
	}

	private static void tablePrint() {

		System.out.print("   학생이름   ");
		
		for (int i = 0; i < subject.length; i++) {
			
			System.out.print( subject[i] + "        ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("   " + name[i] + "     " );
			for (int j = 0; j < grade.length; j++) {
				
				sum[i] += grade[j][i];
				
				System.out.printf("%.2f     ", grade[j][i] );
				
			}
			
			avg[i] = sum[i] / 4;
			
			System.out.printf("%.2f   %.2f", sum[i], avg[i] );
			
			System.out.println();
			
		}
		
		
		rankSet();
		
		rankPrint();
	
	}

	private static void rankPrint() {
		System.out.println(" 학생 이름    평균         순위 ");
		
		int listNum = 1;
		
		while (listNum < 6) {
		
			for (int i = 0; i < name.length; i++) {
			
				if (rank[i] == listNum) {
					System.out.printf(" %4s %10.2f %10d\n", name[i], avg[i], rank[i] );
					listNum = rank[i] + 1;
				}
				
				
			}
			
		}
	}

	private static void rankSet() {
	
		for (int i = 0; i < name.length; i++) {
			
			for (int j = 0; j < name.length; j++) {
				
				if ( sum[i] < sum[j] ) {
					rank[i]++;
				}
				
			}
			
		}
		
	}

}
