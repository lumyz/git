package test.ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		String strValue1, strValue2, strValue3;

		String strValuelink;

		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° ���ڿ��� �Է��Ͻÿ� - > ");

		strValue1 = scan.nextLine();

		System.out.print("�ι�° ���ڿ��� �Է��Ͻÿ� - > ");

		strValue2 = scan.nextLine();
		
		System.out.print("����° ���ڿ��� �Է��Ͻÿ� - > ");

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
