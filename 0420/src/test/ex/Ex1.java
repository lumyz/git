package test.ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		String strValue1, strValue2;
		
		String strValuelink;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���ڿ��� �Է��Ͻÿ� - > ");
		
		strValue1 = scan.nextLine();
		
		System.out.print("�ι�° ���ڿ��� �Է��Ͻÿ� - > ");
		
		strValue2 = scan.nextLine();
		
		strValuelink = stringLink(strValue1, strValue2);
		
		System.out.println(strValuelink);
		
		scan.close();
		
	}

	private static String stringLink(String strValue1, String strValue2) {
		
		String result;
		
		result = strValue1 + strValue2;
		
		return result;
	}

}
