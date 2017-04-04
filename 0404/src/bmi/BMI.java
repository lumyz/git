package bmi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		double weight, height, BMI;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------BMI 계산기------");
		System.out.print("체중 입력(kg)");
		weight = scan.nextDouble();
		
		System.out.print("신장 입력(m)");
		height = scan.nextDouble();
		
		BMI = weight / (height * height);
		
		if (BMI >= 35.0) {
			System.out.println("고도 비만");
		} else if (BMI >= 30.0) {
			System.out.println("중등도 비만");
		} else if (BMI >= 25.0) {
			System.out.println("경도 비만");
		} else if (BMI >= 23.0) {
			System.out.println("과체중");
		} else if (BMI >= 18.5) {
			System.out.println("정상 체중");
		} else {
			System.out.println("저체중");
		}
		
		scan.close();
		
	}

}
