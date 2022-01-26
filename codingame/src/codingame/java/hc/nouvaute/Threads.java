package codingame.java.hc.nouvaute;


//Java Thread Example by extending Thread class

public class Threads extends Thread {

	
	public void run() {
		
		System.out.println("thread is running...");
		
	}
	
	public static void main(String args[]){  
		
		Threads th = new Threads();
		th.start();
	}
}
