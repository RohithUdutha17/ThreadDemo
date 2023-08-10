package threaddemo;

class Cab{
	public String cabDriverName;
	Cab(String cabDriverName){
		this.cabDriverName = cabDriverName;
	}
}

class HoldCab implements Runnable{
	Cab cab;
	HoldCab(Cab cab){
		this.cab = cab;
	}
	public void run() {
		synchronized(cab){
			try {

				System.out.println(cab.cabDriverName+"is hold");
				cab.wait();

				System.out.println(cab.cabDriverName +"is Release");
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class ReleaseCab implements Runnable{
	Cab cab;
	ReleaseCab(Cab cab){
		this.cab = cab;
	}
	public void run() {
		synchronized(cab) {
			try {
				Thread.sleep(5000);
				cab.notify();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cab cab = new Cab("Peter");
		HoldCab holdCab = new HoldCab(cab);
		ReleaseCab releaseCab = new ReleaseCab(cab);
		
		Thread t1 = new Thread(holdCab);
		Thread t2 = new Thread(releaseCab);
		
		t1.start();
		t2.start();

	}

}
