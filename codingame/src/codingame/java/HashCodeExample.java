package codingame.java;

public class HashCodeExample {

	public static void main(String[] args)   
	{  
	//creating two instances of the Employee class  
	Employee emp1 = new Employee("Maria", 22);  
	Employee emp2 = new Employee("Maria", 22);  
	//invoking hashCode() method  
	int a=emp1.hashCode();  
	int b=emp2.hashCode();  
	System.out.println("hashcode of emp1 = " + a);  
	System.out.println("hashcode of emp2 = " + b);  
	System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
	}  
	}  