package codingame.java;

public class Employee {
	
	private String name;
	public Employee(String name, long i) {
		super();
		this.name = name;
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private Long id ;

}
