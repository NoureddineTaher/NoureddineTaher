package codingame.java.hc.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {

	
	private String name;
	
	
	public TestJavaCollection2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TestJavaCollection2(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String args[]){  
		
		LinkedList<String> names =new LinkedList<String>();  
		names.add("Ravi");  
		names.add("Vijay");  
		names.add("Ravi");  
		names.add("Ajay");  
		Iterator<String> itr=names.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
	}
	
	}
}
