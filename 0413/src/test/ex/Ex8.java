package test.ex;

public class Ex8 {

	public static void main(String[] args) {
		
		String strText = "��ȿ, ����, ����, �̳�, ä��, ����, ���, �糪, ����";
		
		String[] textVal = strText.split(", ");
		
		for (int i = 0; i < textVal.length; i++) {
			System.out.print( textVal[i] + "  ");
		}
	}
	
}
