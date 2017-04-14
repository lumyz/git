package test.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		String strNum;
		
		Scanner scan = new Scanner(System.in);
		
		strNum = scan.nextLine();
		
	 	long startTime = System.nanoTime();
		
		char[] a = strNum.toCharArray();
		
		Arrays.sort(a);
		
		strNum = "";
		
		strNum = String.valueOf(a);
		
		strNum = new StringBuffer(strNum).reverse().toString();
		
		System.out.println(strNum);
		
		long endTime = System.nanoTime();
		
		float elapsedTime = (float)(endTime - startTime) / 100000000;
		
		System.out.println( elapsedTime );
		
		scan.close();
	}

}
