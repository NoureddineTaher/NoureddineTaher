package codingame.java;


import java.util.Arrays;

public class ExistNumberInTable {

	static boolean exists(int[] ints, int k) {
		
		boolean b = Arrays.stream(ints).parallel().anyMatch(value -> value == k);
		if (ints.length == 0) {
			return false;
		}
		
		boolean trouve = false;
		int id =0;
		int ifin = ints.length;
		int im;
		
		while(!trouve && ((ifin - id) > 1)) {
			
			im = (id + ifin) / 2;
			trouve = (ints[im] == k);
			if(ints[im] > k) {
				ifin = im;
			} else {
				id = im;
			}
		}

		return (ints[id] == k);
	}
	
	 public static void main(String[] args) {
	        int[] ints = {-9, 14, 37, 102};
	        System.out.println(ExistNumberInTable.exists(ints, 102)); // true
	        System.out.println(ExistNumberInTable.exists(ints, 36)); // false
	    }
	
	
}
