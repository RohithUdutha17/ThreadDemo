package threaddemo;

import java.util.Scanner;

class MyThread1 extends Thread{
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		String userName,emailId;
		System.out.println("Enter username");
		userName = sc.next();
		System.out.println("Enter emailId");
		emailId = sc.next();
		
		System.out.println(userName+emailId);
	}
}

class MyThread2 extends Thread{

	private int prinicipal = 12000;
	private double rate = 3;
	private double time = 4;
	
	public void run() {
		double simpleInterest = ( prinicipal * rate * time )/100;
		System.out.println("SimpleInterest is :"+simpleInterest);
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		mt1.setName("Child Thread 1");
		mt2.setName("child thread 2");
		mt2.start();
		mt1.start();
		
	}
}
