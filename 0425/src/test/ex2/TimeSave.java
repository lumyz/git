package test.ex2;

public class TimeSave {

	int hour, minute, second;

	public TimeSave(int i, int j, int k) {
		this.hour = i;
		this.minute = j;
		this.second = k;
	}

	public void printTime() {
		System.out.printf("����� �ð� : %d�� %d�� %d�� \n", hour, minute, second);
	}

	public void equalTime(TimeSave ts) {
		if (hour == ts.hour && minute == ts.minute && second == ts.second) {
			System.out.println("�� �ð��� �����ϴ�.");
		} else {
			System.out.println("�� �ð��� �ٸ��ϴ�.");
		}
	}

}
