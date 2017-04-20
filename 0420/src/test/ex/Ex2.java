package test.ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		String strValue1, strValue2, strValue3;

		String strValuelink;

		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 문자열을 입력하시오 - > ");

		strValue1 = scan.nextLine();

		System.out.print("두번째 문자열을 입력하시오 - > ");

		strValue2 = scan.nextLine();
		
		System.out.print("세번째 문자열을 입력하시오 - > ");

		strValue3 = scan.nextLine();

		strValuelink = stringLink(strValue1, strValue2, strValue3);

		System.out.println(strValuelink);

		scan.close();

	}

	private static String stringLink(String strValue1, String strValue2, String strValue3) {

		String result;

		result = strValue1 + strValue2 + strValue3;

		return result;
		
	}

}
