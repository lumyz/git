package test.ex3;


public class Main {

	public static void main(String[] args) {
		
		Warker warker = new Warker();
		
		warker.num = 1;
		warker.name = "���缮";
		warker.pos = "�븮";
		warker.adress = "���������� �߱�";
		
		Warker warker2 = new Warker(100);
		
		warker2.num = 2;
		warker2.name = "�ڸ��";
		warker2.pos = "����";
		warker2.adress = "���������� ����";
		
		warker.printInfo();
		
		warker2.printInfo();
		
		/*
		System.out.printf("%d %s %s %s \n", warker.num, warker.name, warker.pos, warker.adress);
		System.out.printf("%d %s %s %s", warker2.num, warker2.name, warker2.pos, warker2.adress);
		*/
	}
	
}
