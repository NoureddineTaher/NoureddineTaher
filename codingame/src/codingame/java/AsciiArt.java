package codingame.java;

import java.util.Arrays;
import java.util.Scanner;

public class AsciiArt {
	
	// convert char to int
	 public static int convertCharToInt(char ch ) {		 
		 int num = ch;	 
		 return num;
		 
	 }
	 
	
	 
	  public static char scanChar(String s) {
	        for (char c = 'A'; c <= 'Z'; c++) {
	            if (AsciiArt.printChar(c).equals(s)) {
	                return c;
	            }
	        }
	        return '?';
	    }
	
	  public static String printChar(char s) {
	        return "S";
	    }
	  
	public static void main(String[] args) {
		
		//char ch = 'w';		
		//System.out.println( "ASCII value of char "+ch+ " is: "+ convertCharToInt(ch));
		
		String art = AsciiArt.printChar('J');
        String art1 = AsciiArt.printChar('B');
        System.out.println(scanChar(art));
        System.out.println(scanChar(art1));
		 

    } 
	
	 

}


