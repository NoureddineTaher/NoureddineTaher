package codingame.java.hc.nouvaute;


// Java Thread Example by implementing Runnable interface
public class Threads1 implements Runnable {

	public static void main(String[] args) {
		Threads1 th = new Threads1();
		Thread t1 =new Thread(th);   // Using the constructor Thread(Runnable r)  
		t1.start();  
	}

	@Override
	public void run() {
		System.out.println("thread is running...");
		
	}

}
