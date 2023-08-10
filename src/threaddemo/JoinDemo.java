package threaddemo;

class Thread1 extends Thread{
	public void run() {
		
		System.out.println("thread 1 started");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("t1 ended");
	}
}

class Thread2 extends Thread{
	public void run() {
		System.out.println("thread 2 started");
		
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
	}

}
