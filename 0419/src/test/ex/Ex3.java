package test.ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		double weight, height, result;
		
		String state;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자신의 키를 입력해주세요(m) - > ");
		
		height = scan.nextDouble();
		
		System.out.print("자신의 체중을 입력해주세요(kg) - > ");
		
		weight = scan.nextDouble();
		
		result = resultOfBMI(weight, height);
		
		state = stateOfBMI(result);
		
		System.out.print("키 : " + height + "\n" + "체중 : " + weight + "\n" + "BMI(체질량 지수) : " + result +"\n" + "체중 상태 : " + state);
		
		scan.close();
		
	}

	private static String stateOfBMI(double result) {
		
		String state = "";
		
		if (result <= 18.5) {
			state = "저체중";
		} else if (result <= 24.9) {
			state = "정상";
		} else if (result <= 29.9) {
			state = "과제중";
		} else {
			state = "비만";
		}
		
		return state;
	}

	private static double resultOfBMI(double weight, double height) {

		double BMI;
		
		BMI = weight / (height * height);
		
		return BMI;
	
	}

}
