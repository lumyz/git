package test.ex1;

public class Main {

	public static void main(String[] args) {

		Drink[] drinks = new Drink[] {
					new Drink ( 1, "�ݶ�", 1000 ),
					new Drink ( 2, "���̴�", 1500 ),
					new Drink (3, "���ڿ���", 1200 ),
					new Drink (4, "���⿡��", 1200 )
		};
		
		VMachine vmachine = new VMachine(drinks);
		
		vmachine.printDrinkIndex();
		
		
		
	}

}
