import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int lang = 97, math = 75, eng = 85, sum;
		double avg;
		
		sum = lang + math + eng;
		
		avg = (double)sum / 3;
		
		System.out.println("국어 점수 : " + lang + "\n수학 점수 : " + math + "\n영어 점수 : " + eng);
		System.out.println("3과목 총점 : " + sum);
		System.out.printf("3과목 평균 : %5.2f ", avg);
		
		double result;
		String msg, unit;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력값을 변환할 단위를 입력하시오(cm, inch) -> ");
		
		unit = scan.nextLine();
		
		System.out.println("변환할 값을 입력하시오(123) ->");
		
		msg = scan.nextLine();
		
		if (unit.equals("cm") || unit.equals("CM")) {
			result = Double.parseDouble(msg) * 2.54;
			System.out.println(msg + "inch\b" + unit + "단위변환 ->" + result);
		} else if (unit.equals("inch") || unit.equals("INCH")) {
			result = Double.parseDouble(msg) * 0.393701;
			System.out.println(msg + "inch\b" + unit + "단위변환 ->" + result);
		} else {
			System.out.println("잘못입력했습니다. 다시 실행해주세요.");
		}*/
		
		double cm, inch;
		final double cmToInch = 0.39370;
		
		System.out.println("-- 센티미터 인치 변환 프로그램 --");
		System.out.println("센티미터 입력 : ");
		
		Scanner scan = new Scanner(System.in);
				
		cm = scan.nextDouble();
		
		inch = cm * cmToInch;
		
		System.out.println("변화된 인치는 " + inch);
		scan.close();
	}
	
	
	

}
