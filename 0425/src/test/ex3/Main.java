package test.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		String str4 = new String("ȫ�浿");
		String str5;
		String str6;
		
		Scanner scan  = new Scanner(System.in);
		
		str5 = scan.nextLine();
		str6 = scan.nextLine();
		
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str1.hashCode()));
		System.out.println(str2.getClass() + "@" + Integer.toHexString(str2.hashCode()));
		System.out.println(str3.getClass() + "@" + Integer.toHexString(str3.hashCode()));
		System.out.println(str4.getClass() + "@" + Integer.toHexString(str4.hashCode()));
		System.out.println(str5.getClass() + "@" + Integer.toHexString(str5.hashCode()));
		System.out.println(str6.getClass() + "@" + Integer.toHexString(str6.hashCode()));
		
		System.out.println();
		
		System.out.println(Integer.toHexString(System.identityHashCode(str1)));
		System.out.println(Integer.toHexString(System.identityHashCode(str2)));
		System.out.println(Integer.toHexString(System.identityHashCode(str3)));
		System.out.println(Integer.toHexString(System.identityHashCode(str4)));
		System.out.println(Integer.toHexString(System.identityHashCode(str5)));
		System.out.println(Integer.toHexString(System.identityHashCode(str6)));
		
		
		
	}

}
