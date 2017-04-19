package test.ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		double weight, height, result;
		
		String state;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ڽ��� Ű�� �Է����ּ���(m) - > ");
		
		height = scan.nextDouble();
		
		System.out.print("�ڽ��� ü���� �Է����ּ���(kg) - > ");
		
		weight = scan.nextDouble();
		
		result = resultOfBMI(weight, height);
		
		state = stateOfBMI(result);
		
		System.out.print("Ű : " + height + "\n" + "ü�� : " + weight + "\n" + "BMI(ü���� ����) : " + result +"\n" + "ü�� ���� : " + state);
		
		scan.close();
		
	}

	private static String stateOfBMI(double result) {
		
		String state = "";
		
		if (result <= 18.5) {
			state = "��ü��";
		} else if (result <= 24.9) {
			state = "����";
		} else if (result <= 29.9) {
			state = "������";
		} else {
			state = "��";
		}
		
		return state;
	}

	private static double resultOfBMI(double weight, double height) {

		double BMI;
		
		BMI = weight / (height * height);
		
		return BMI;
	
	}

}
