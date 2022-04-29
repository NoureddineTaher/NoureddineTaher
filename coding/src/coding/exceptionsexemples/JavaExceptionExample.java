package coding.exceptionsexemples;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			
			// code that may raise exception
			int data = 100 / 0;
			String s=null; 
			String s1="abc";  
			int a[]=new int[5];  
			a[10]=50;  
			int i=Integer.parseInt(s);
			System.out.println(s.length());  
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		// rest code of the program
		System.out.println("rest of the code...");
		System.out.println(" NullPointerException"); 
		System.out.println(" NumberFormatException");
		System.out.println(" ArrayIndexOutOfBoundsException");
	}
}