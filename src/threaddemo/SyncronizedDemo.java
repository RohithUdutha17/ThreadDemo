package threaddemo;

public class SyncronizedDemo implements Runnable {

	private String[] names = {"peter","jones","edward","simond"};
	
	 public void run() {
		printNames();
	}
	 synchronized public void printNames() {
		for(String name:names) {
			System.out.println(Thread.currentThread().getName()+" "+  name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SyncronizedDemo sd1 = new SyncronizedDemo();
		
		Thread th1 = new Thread(sd1);
		Thread th2 = new Thread(sd1);
		
		th1.start();
		th2.start();
	}

}
