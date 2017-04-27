package test.ex2;

public class TimeSave {

	int hour, minute, second;

	public TimeSave(int i, int j, int k) {
		this.hour = i;
		this.minute = j;
		this.second = k;
	}

	public void printTime() {
		System.out.printf("저장된 시간 : %d시 %d분 %d초 \n", hour, minute, second);
	}

	public void equalTime(TimeSave ts) {
		if (hour == ts.hour && minute == ts.minute && second == ts.second) {
			System.out.println("두 시간은 같습니다.");
		} else {
			System.out.println("두 시간은 다릅니다.");
		}
	}

}
