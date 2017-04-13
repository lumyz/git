package test.ex;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		int count = 0, timeCount = 0, timeMinute, timeSecond;
		
		boolean setTimer = false, restart = true;
		
		String arrival, departure;
		
		String[] map = {"�ݼ�", "����(ħ�Ŵ�)", "����", "������ �����", "�����", "����", "������õ(�泲��, �����)", "��õ", "����(ī�̽�Ʈ)", "����", "����û��", "��û", "ź��", "�빮", "����", "�������װŸ�", " �߱�û", "�߾ӷ�", "������", "�뵿(��۴�)", "����", "�Ǿ�"};
		int[] timer = {500, 300, 700, 320, 440, 340, 180, 230, 456, 230, 890, 340, 120, 789, 230, 543, 888, 333, 456, 789, 300};
		
		Scanner scan = new Scanner(System.in);
		
		while (restart) {
			System.out.println("----����ö�� ���----");

			for (int i = 0; i < map.length; i++) {
				System.out.print( map[i] + " --> ");
				
				count++;
				
				if (count == 10) {
					count = 0;
					System.out.println();
				}
				
			}
			
			System.out.println();
			
			System.out.print("��߿� : ");
			departure = scan.nextLine();
			
			System.out.print("������ : ");
			arrival = scan.nextLine();
			
			System.out.print("���������� �ɸ��� �ð� : ");
			
			for (int i = 0; i < map.length; i++) {
				if (departure.equals(map[i])) {
					setTimer = true;
				}
				
				if (setTimer && i != map.length - 1) {
					timeCount += timer[i];
				}
				
				if (arrival.equals(map[i])) {
					setTimer = false;
				}
			}
			timeSecond = timeCount % 60;
			timeMinute = timeCount / 60;
			
			System.out.println(timeMinute + "�� " + timeSecond + "��" );
			
			System.out.println("����Ͻ÷��� '���'�� �Է����ּ���.");
			
			if (scan.nextLine().equals("���")) {
				restart = true;
			} else {
				System.out.println("�����մϴ�.");
			}
		}
		
		scan.close();
		
	}

}
