import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int lang = 97, math = 75, eng = 85, sum;
		double avg;
		
		sum = lang + math + eng;
		
		avg = (double)sum / 3;
		
		System.out.println("���� ���� : " + lang + "\n���� ���� : " + math + "\n���� ���� : " + eng);
		System.out.println("3���� ���� : " + sum);
		System.out.printf("3���� ��� : %5.2f ", avg);
		
		double result;
		String msg, unit;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է°��� ��ȯ�� ������ �Է��Ͻÿ�(cm, inch) -> ");
		
		unit = scan.nextLine();
		
		System.out.println("��ȯ�� ���� �Է��Ͻÿ�(123) ->");
		
		msg = scan.nextLine();
		
		if (unit.equals("cm") || unit.equals("CM")) {
			result = Double.parseDouble(msg) * 2.54;
			System.out.println(msg + "inch\b" + unit + "������ȯ ->" + result);
		} else if (unit.equals("inch") || unit.equals("INCH")) {
			result = Double.parseDouble(msg) * 0.393701;
			System.out.println(msg + "inch\b" + unit + "������ȯ ->" + result);
		} else {
			System.out.println("�߸��Է��߽��ϴ�. �ٽ� �������ּ���.");
		}*/
		
		double cm, inch;
		final double cmToInch = 0.39370;
		
		System.out.println("-- ��Ƽ���� ��ġ ��ȯ ���α׷� --");
		System.out.println("��Ƽ���� �Է� : ");
		
		Scanner scan = new Scanner(System.in);
				
		cm = scan.nextDouble();
		
		inch = cm * cmToInch;
		
		System.out.println("��ȭ�� ��ġ�� " + inch);
		scan.close();
	}
	
	
	

}
