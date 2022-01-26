package codingame.java;

public class StudentEncapsulation {
	
	public static void main(String[] args){  
		
		Student s = new Student();
		s.setCin(12345563);
		s.setName("Mahfoudh");
		
		System.out.println(s.getCin());
		System.out.println(s.getName());
		
		
	}

}
