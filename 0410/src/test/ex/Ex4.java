package test.ex;

public class Ex4 {

	public static void main(String[] args) {

		double[] engGrade = new double[] {88.5, 85, 77.65, 70, 90, 66, 90, 65};
		String[] studentName = new String[] {"��ȣ��", "���缮", "�ŵ���", "�迬��", "�۰�ȣ", "������", "���ϴ�", "������"};
		
		double sum = 0, avg;
		
		for (int i = 0; i < engGrade.length; i++) {
			sum += engGrade[i];
			
			System.out.println("  " + (i + 1) + "  " + studentName[i] + "  " + engGrade[i]);
		}
		
		avg = sum / engGrade.length;
		
		System.out.println("���� ���� : " + sum);
		System.out.println("���� ��� : " + avg);
		
	}

}
