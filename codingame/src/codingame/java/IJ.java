package codingame.java;

public class B extends A {
	
	public static boolean a(int i, int j) {
		 
		 if( (i == 1 || j == 1)) {
			 return true;
		 }
		 else if (i+j == 1) {
			 return true;
			 
		 }
		return false;
		 
		 
	 }

   // public static int counter = 2;   
 
    // Returns 1 if n is a lucky no.
    // otherwise returns 0
   public  static int moneyLucky(int n, int counter)
    {
    
        int next_position = n - (n/counter);
        return next_position;
    }
     
    // driver program
    public static void main (String[] args)
    {
        int x = 7; int c = 3; int k=0;
        System.out.println(" is a lucky no    " + moneyLucky(x,c));
        
        System.out.println(a(-3,4));

    }

}
