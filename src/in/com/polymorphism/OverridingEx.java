package in.com.polymorphism;

public class OverridingEx {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showDetails() {
		System.out.println("This is a parent class");
		System.out.println("Employee Details call");
		System.out.println("Employee id"+getId());
		System.out.println("Employee name"+getName());
	}

}
