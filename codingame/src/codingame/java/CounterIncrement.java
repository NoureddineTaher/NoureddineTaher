package codingame.java;

public class CounterIncrement {

	
	private static int  count = 0;
	
	
	 public int getCount() {
	        return count ;
	    }
	
	public synchronized void incrementCount() {
		++ count;
		
	}
	
	
}
