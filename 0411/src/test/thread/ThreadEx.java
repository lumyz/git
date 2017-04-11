package test.thread;

import java.util.ArrayList;
import java.util.Random;

public class ThreadEx extends Thread {

	private int id = -1;
	
	private static int index = 0;
	
	public ThreadEx(int id){
		this.id = id;
	}
	
	public void run() {
		System.out.println( id + "번 스레드 동작 중....");
		Random r = new Random(System.currentTimeMillis());
		
		try {
			long s = r.nextInt(3000);
			Thread.sleep(s);
			setIndex();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println( id + "번 스레드 동작 종료....");
		
	}
	
	public synchronized static void setIndex() {
		index++;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start main method.");
		
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		
		for (int i = 0; i < 10; i++) {
			ThreadEx test = new ThreadEx(i);
			test.start();
			threadList.add(test);
		}
		for (int i = 0; i < threadList.size(); i++) {
			try {
				threadList.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("current Index : " + index);
		System.out.println("End main method.");

	}

}
