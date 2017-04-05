package test.fors;

public class Ex5 {

	public static void main(String[] args) {

		
		
		for (int i = 1000; i < 10000; i++) {
			
			int num1, num2;
			String i_num;
			
			i_num = Integer.toString(i);
			
			num1 = Integer.parseInt(i_num.substring(0, 2));
			num2 = Integer.parseInt(i_num.substring(2, 4));
			
			if ((num1 + num2)*(num1 + num2) == i) {
				System.out.print(i + "\t");
			}
		}
		
	}

}
