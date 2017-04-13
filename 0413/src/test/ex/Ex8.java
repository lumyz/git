package test.ex;

public class Ex8 {

	public static void main(String[] args) {
		
		String strText = "지효, 쯔위, 정연, 미나, 채영, 나연, 모모, 사나, 다현";
		
		String[] textVal = strText.split(", ");
		
		for (int i = 0; i < textVal.length; i++) {
			System.out.print( textVal[i] + "  ");
		}
	}
	
}
