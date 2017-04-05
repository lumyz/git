package test.whiles;

public class Ex8 {

	public static void main(String[] args) {
		
		int x = 1, value = 1024;
		
		while (x <= value){
			if ((value % x) == 0) {
				System.out.print(x + "\t");
			}
			x++;
		}
	}
}
