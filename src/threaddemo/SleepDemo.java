package threaddemo;

import java.util.Scanner;

public class SleepDemo extends Thread{

	public void run() {
		Scanner sc = new Scanner(System.in);
		String userName, emailId;
		System.out.println("enter username and email");
		userName = sc.next();
		emailId = sc.next();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(userName +" "+ emailId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepDemo sleepDemo = new SleepDemo();
		sleepDemo.start();
	}

}
