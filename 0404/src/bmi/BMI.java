package bmi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		double weight, height, BMI;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------BMI ����------");
		System.out.print("ü�� �Է�(kg)");
		weight = scan.nextDouble();
		
		System.out.print("���� �Է�(m)");
		height = scan.nextDouble();
		
		BMI = weight / (height * height);
		
		if (BMI >= 35.0) {
			System.out.println("�� ��");
		} else if (BMI >= 30.0) {
			System.out.println("�ߵ ��");
		} else if (BMI >= 25.0) {
			System.out.println("�浵 ��");
		} else if (BMI >= 23.0) {
			System.out.println("��ü��");
		} else if (BMI >= 18.5) {
			System.out.println("���� ü��");
		} else {
			System.out.println("��ü��");
		}
		
		scan.close();
		
	}

}
