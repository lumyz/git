package test.fors;

import java.time.Year;

public class Ex9 {

	public static void main(String[] args) {
		
		final int maxYear = 2020;
		double deposit = 1000000, compoundInterest = 0.1;
		
		for (int year = 2001;  year <= maxYear; year++) {
		
			deposit += deposit * compoundInterest;
			
			System.out.printf("%d년도 예금액 : %.0f \n", year, deposit);
			
		}
		
	}

}
