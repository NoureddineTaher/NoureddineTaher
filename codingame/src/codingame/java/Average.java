package codingame.java;

import java.util.Arrays;

public class Average {
	
	
	
	
	
	
	// function average of table
	public static double findAverage(int[] array) {
	    int sum = 0;
	    double moy = 0;
	    
	    for (int i = 0; i < array.length; i++ ) {
	        sum += array[i];
	    }
	    moy = sum / array.length;
	    return moy;
	}
	
	// function max of table
	public static int  findMaxTable(int [] numbers) {
	    int max =numbers[0];
	
	    for(int i=0; i< numbers.length; i++){
	     if(numbers[i] > max ){
	         max = numbers[i];
	     }        
	    }
		return max;
	}
	
	// function min of table
	public static int  findMinTable(int [] numbers) {
	    int min =numbers[0];
	
	    for(int i=0; i< numbers.length; i++){
	     if(numbers[i] < min ){
	         min = numbers[i];
	     }        
	    }
		return min;
	}
	
	// function find smallest interval
	 public static int findSmallestInterval (int [] numbers) {
	        
		 Arrays.sort(numbers);//i sorted it
		 int diff = numbers[1] - numbers[0];
		 int diffNeu = 0;

		 for(int i = 1; i < numbers.length-1; i++)
		 {
		     diffNeu = numbers[i + 1] - numbers[i];
		     if(diffNeu < diff)
		     {
		         diff = diffNeu;
		     }
		 }
	        ;
			return diffNeu;
	    }
	 
	 
	// function find largest interval

		 public static int range(int [] numbers) {
			     
			        int max =numbers[0];
			        int min = numbers[0];
			        for (int i = 1; i < numbers.length; i++) {
			            if (i > max) {
			                max = i;
			            } else if (i < min) {
			                min = i;
			            }
			        }
			        return (max - min)+1 ;
			    
			}
		 
		 public static boolean a(int i, int j) {
			 
			 if( i == 1 || j == 1) {
				 return true;
			 }
			 else if (i+j == 1) {
				 return true;
				 
			 }

			 else 
			return false;
			 
			 
		 }
		 
		 
		  public static int sumRange(int[] ints) {
		        int sum = 0;
		        for (int i=1; i < ints.length; i++) {
		            int n = ints[i];
		            if(n >= 10 || n <= 100)
			        	sum = sum + n;
		        }
		        
		        
		        return sum;
		    }

		      
	public static void main(String[] args) {   
	       int[] numbers = {1, 4, 8,6,2};
	       int[] tab = {1,2, 4,10,16, 32,50,199};
//	    
//	        System.out.println("Average value of the array elements is : " + findAverage(numbers));
//	        System.out.println("max value of the array elements is : " +findMaxTable(numbers));
//	        System.out.println("min value of the array elements is : " +findMinTable(numbers));
	       // System.out.println("The smallest intervall is : " +findSmallestInterval(numbers));
//	        System.out.println("The largest intervall is : " +range(numbers));
	     
//	        System.out.println(a(2,3)); 
//	        System.out.println(a(1,0)); 
//	        System.out.println(a(1,1)); 
//	        System.out.println(a(-2,3));
	       System.out.println(sumRange(tab)); 
	        
	   }

}
