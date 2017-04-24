package test.ex3;


public class Main {

	public static void main(String[] args) {
		
		Warker warker = new Warker();
		
		warker.num = 1;
		warker.name = "유재석";
		warker.pos = "대리";
		warker.adress = "대전광역시 중구";
		
		Warker warker2 = new Warker(100);
		
		warker2.num = 2;
		warker2.name = "박명수";
		warker2.pos = "과장";
		warker2.adress = "대전광역시 서구";
		
		warker.printInfo();
		
		warker2.printInfo();
		
		/*
		System.out.printf("%d %s %s %s \n", warker.num, warker.name, warker.pos, warker.adress);
		System.out.printf("%d %s %s %s", warker2.num, warker2.name, warker2.pos, warker2.adress);
		*/
	}
	
}
