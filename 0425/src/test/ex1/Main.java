package test.ex1;

public class Main {

	public static void main(String[] args) {

		Warker[] warker = new Warker[] { 
				new Warker(1, "���缮", "�븮", "���������� �߱�"),
				new Warker(2, "�ڸ��", "����", "���������� ����") 
		};

		warker[0].printInfo();

		warker[1].printInfo();

		/*
		 * System.out.printf("%d %s %s %s \n", warker.num, warker.name,
		 * warker.pos, warker.adress); System.out.printf("%d %s %s %s",
		 * warker2.num, warker2.name, warker2.pos, warker2.adress);
		 */
	}

}
