package test.goods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	final static int milkPrice = 1200, milkInfantDC = 100
			, cokePrice = 1500, waterPrice = 800, waterInfantDC = 200;
	
	public static void main(String[] args) {
		/* 
		 * ���� 1200 �̼����� 19�̸� 100����
		 * �ݶ� 1500
		 * ���� 800 ����200
		 * �����ݶ� ���� ���� ���� ���� �Է� ��
		 * ���� �Է� ���� ��縦 ��� ���� �����Һ�� ���
		 * */
		
		int milkCount, cokeCount, waterCount, total;
		
		boolean age;
		String birth;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ---- �����׸� ��� ���α׷� ---- ");
		
		System.out.println(" �׸��� �Է��Ͻÿ� ");
		
		System.out.print(" ���� ���� ���� : ");
		
		milkCount = scan.nextInt();
		
		System.out.print(" �ݶ� ���� ���� : ");
		
		cokeCount = scan.nextInt();
		
		System.out.print(" ���� ���� ���� : ");
		
		waterCount = scan.nextInt();
		
		System.out.print(" ������ �������(ex 19931210) : ");
		
		birth = String.valueOf(scan.nextInt());
		
		age = ageSet(birth);
		
		total = total(milkCount, cokeCount, waterCount, age); 
		
		System.out.print(" ������ ������ �� ���� �ݾ� : " + total);
	
	}

	private static int total(int mc, int cc, int wc, boolean age) {
	
		int dc, sum = milkPrice * mc + cokePrice * cc + waterPrice * wc; 
		
		if (!age) {
			dc = mc * milkInfantDC + wc * waterInfantDC;
			
			sum = sum - dc;
		}
		
		
		return sum;
	}

	private static boolean ageSet(String birth) {
				
		boolean returnValue = false;
		
		int currtimeYear, currtimeMonth, currtimeDay, birthYear, birthMonth, birthDay;

		currtimeYear = Integer.parseInt(currentTimeSet()[0]);
		currtimeMonth = Integer.parseInt(currentTimeSet()[1]);
		currtimeDay = Integer.parseInt(currentTimeSet()[2]);
		
		birthYear = Integer.parseInt(birth.substring(0,4));
		birthMonth = Integer.parseInt(birth.substring(4,6));
		birthDay = Integer.parseInt(birth.substring(6,8));
		
		int age = currtimeYear - birthYear;
		
		if (age == 19) {
			
			if (currtimeMonth > birthMonth) {
				returnValue = true;
			} else if (currtimeMonth == birthMonth) {
				if (currtimeDay >= birthDay) {
					 returnValue = true;
				}
			}
			
		} else if (age > 19) {
			returnValue = true;
		}
		
		return returnValue;
	}

	private static String[] currentTimeSet() {
		
		String[] currentTimes;
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd");
		
		String currentTime = dateFormat.format(cal.getTime());
		
		currentTimes = currentTime.split(":");
		
		return currentTimes;
		
	}
	
	
		
}
