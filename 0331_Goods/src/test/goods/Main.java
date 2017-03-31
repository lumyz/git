package test.goods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	final static int milkPrice = 1200, milkInfantDC = 100
			, cokePrice = 1500, waterPrice = 800, waterInfantDC = 200;
	
	public static void main(String[] args) {
		/* 
		 * 우유 1200 미성년자 19미만 100할인
		 * 콜라 1500
		 * 생수 800 할인200
		 * 우유콜라 생수 구입 수량 각각 입력 고객
		 * 나의 입력 할인 행사를 고려 고객의 총지불비용 출력
		 * */
		
		int milkCount, cokeCount, waterCount, total;
		
		boolean age;
		String birth;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ---- 구입항목 계산 프로그램 ---- ");
		
		System.out.println(" 항목을 입력하시오 ");
		
		System.out.print(" 우유 구매 수량 : ");
		
		milkCount = scan.nextInt();
		
		System.out.print(" 콜라 구매 수량 : ");
		
		cokeCount = scan.nextInt();
		
		System.out.print(" 생수 구매 수량 : ");
		
		waterCount = scan.nextInt();
		
		System.out.print(" 고객님의 생년월일(ex 19931210) : ");
		
		birth = String.valueOf(scan.nextInt());
		
		age = ageSet(birth);
		
		total = total(milkCount, cokeCount, waterCount, age); 
		
		System.out.print(" 고객님의 구매의 총 지불 금액 : " + total);
	
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
