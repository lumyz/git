package test.ex;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 		00 �б����� ����, ����, ���� ���� ������ �Ʒ��� ���� �־�����.
		 * 		�̸�		����	����	����
		 * 		��ȣ��	80	85	56
		 * 		���缮	78	77	78
		 * 		�ŵ���	75	83	77	
		 * 		ȫ�浿	90	78	80
		 * 		������	85	90	85
		 * 
		 * 		������ �־��� ������ 2���� �迭�� �����ϰ� ���� ���Ĵ�� ����Ͻÿ�.( �̸� ���� )
		 * 		[��, 2���� �迭���� �� 1������ ���� ���� �迭��]
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
				
			String[] strName = new String[] {"��ȣ��", "���缮", "�ŵ���", "ȫ�浿", "������"};

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
