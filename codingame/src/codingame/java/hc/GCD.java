package codingame.java.hc;



public class GCD {
	
	// function iprime
	public static boolean isprime(int k) {
		for(int i = 2 ; i < k; i++) {
			if(k % i == 0 )
				return false;
		}
		
		
		return true;
		
	}
	// FUNCTION CALCULATE GCD
	public static int calculatePgcd(int x, int y) {
		int gcd = 1;
		for(int i = 1; i <= x && i <=y; i++) {
			if(x % i== 0 && y % i == 0) {
				gcd = i;
			}
		}
		
		return gcd;

	}
	
	public static void main(String args[]){
		
		System.out.println( calculatePgcd (81,153));
		System.out.println( isprime (7));
		
	}
}
