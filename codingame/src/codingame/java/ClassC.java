package codingame.java;

public class ClassC extends IntB {

	public static void main(String[] args) {
		
		IntA a=new ClassC();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  

	}

	@Override
	public void a() {
		System.out.println("Im a method");
		
	}

	@Override
	public void c() {
		System.out.println("Im c method");
		
	}

	@Override
	public void d() {
		System.out.println("Im d method");
		
	}

}
