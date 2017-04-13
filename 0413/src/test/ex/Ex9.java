package test.ex;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		int count = 0, timeCount = 0, timeMinute, timeSecond;
		
		boolean setTimer = false, restart = true;
		
		String arrival, departure;
		
		String[] map = {"반석", "지족(침신대)", "노은", "월드컵 경기장", "현충원", "구암", "유성온천(충남대, 목원대)", "갑천", "월평(카이스트)", "갈마", "정부청사", "시청", "탄방", "용문", "오룡", "서대전네거리", " 중구청", "중앙로", "대전역", "대동(우송대)", "신흥", "판암"};
		int[] timer = {500, 300, 700, 320, 440, 340, 180, 230, 456, 230, 890, 340, 120, 789, 230, 543, 888, 333, 456, 789, 300};
		
		Scanner scan = new Scanner(System.in);
		
		while (restart) {
			System.out.println("----지하철역 목록----");

			for (int i = 0; i < map.length; i++) {
				System.out.print( map[i] + " --> ");
				
				count++;
				
				if (count == 10) {
					count = 0;
					System.out.println();
				}
				
			}
			
			System.out.println();
			
			System.out.print("출발역 : ");
			departure = scan.nextLine();
			
			System.out.print("도착역 : ");
			arrival = scan.nextLine();
			
			System.out.print("목적지까지 걸리는 시간 : ");
			
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
			
			System.out.println(timeMinute + "분 " + timeSecond + "초" );
			
			System.out.println("계속하시려면 '계속'을 입력해주세요.");
			
			if (scan.nextLine().equals("계속")) {
				restart = true;
			} else {
				System.out.println("종료합니다.");
			}
		}
		
		scan.close();
		
	}

}
