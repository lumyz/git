package test.ex1;

public class Main {

	public static void main(String[] args) {

		Drink[] drinks = new Drink[] {
					new Drink ( 1, "콜라", 1000 ),
					new Drink ( 2, "사이다", 1500 ),
					new Drink (3, "초코에몽", 1200 ),
					new Drink (4, "딸기에몽", 1200 )
		};
		
		VMachine vmachine = new VMachine(drinks);
		
		vmachine.printDrinkIndex();
		
		
		
	}

}
