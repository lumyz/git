package test.ex1;

public class Main {

	public static void main(String[] args) {

		Fish fish1 = new Fish();		// Fish Ŭ������ ���� ��ü�� ������.
		
		System.out.print(fish1.type + "   " + fish1.price + "\n");
		
		fish1.type = "�׾";
		fish1.price = 500;
		
		System.out.print(fish1.type + "   " + fish1.price + "\n");
		
		Fish fish2 = new Fish();
		
		System.out.print(fish2.type + "   " + fish2.price + "\n");
		
		fish2.type = "�ؾ";
		fish2.price = 600;
		
		System.out.print(fish2.type + "   " + fish2.price);
		
	}

}
