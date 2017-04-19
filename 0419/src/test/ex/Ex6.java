package test.ex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		String strValue;
		
		Scanner scan = new Scanner(System.in);
		
		strValue = scan.nextLine();
		
		printString(strValue);
		
	}

	private static void printString(String strValue) {

		System.out.println(strValue);			
		
		System.out.println("입력하신 문자열의 길이 : " + strValue.length());
	}

}
