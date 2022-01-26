package codingame.java;

import java.util.Arrays;

public class FindSmallestInterval {
	
	public static int findSmallestInterval (int [] numbers) {
        // we write the code here

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

	
	public static double findSumAverageWithoutUsingStream(int[] array) {
	    int sum = 0;
	    double average = 0;
	    for (int value : array) {
	    	
	        //calculate sum of all array elements
	        sum += value;
	        
	        //calculate average value
	         average = sum / array.length;
	    }
	    return average;
	}
	
	
	
	
	public static void main(String[] args) {
 
		int[] numbers= {1, 6 ,4};
		System.out.println(findSmallestInterval(numbers));
		System.out.println(findSumAverageWithoutUsingStream(numbers));
 
 
	}
 
	 

}
