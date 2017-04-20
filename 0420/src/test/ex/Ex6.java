package test.ex;

public class Ex6 {

	public static void main(String[] args) {

		String[] fruit = { "º¹¼þ¾Æ", "µþ±â", "Æ÷µµ", "¼ö¹Ú" };

		printFruit(fruit);
		
		System.out.println();
		
		String[] reverseFruit = fruitReverse(fruit);

		 for (int i = 0; i < reverseFruit.length; i++) {
				System.out.print(reverseFruit[i] + "   ");
			}
		 
	}

	private static String[] fruitReverse(String[] fruit) {

		String[] reverseFruit = new String[fruit.length];
		
		int j = reverseFruit.length;
		
		for (int i = 0; i < fruit.length; i++) {
			
			j--;
			
			reverseFruit[i] = fruit[j];
			
		}
		
		return reverseFruit;
		
	}

	private static void printFruit(String[] fruit) {

		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i] + "   ");
		}

	}
	
	

}
