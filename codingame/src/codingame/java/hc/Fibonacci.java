package codingame.java.hc;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3, i, max = 10;
		
		for( i = 2; i <= max; i++) {	
			 n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3; 
			
		}
		

	}

}
