package codingame.java.hc.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {
	
	public static void main(String args[]){ 

		ArrayList<String> voitures =new ArrayList<String>();//Creating arraylist  
		voitures.add("Ford");//Adding object in arraylist  
		voitures.add("Bm");  
		voitures.add("Kia");  
		voitures.add("Hunday");  
		//Traversing list through Iterator  
		Iterator itr=voitures.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
