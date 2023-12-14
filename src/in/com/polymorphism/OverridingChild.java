package in.com.polymorphism;

public class OverridingChild extends OverridingEx {
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void showDetails() {
		System.out.println("child method is calling");
		System.out.println("child name"+getName());
		System.out.println("Salary"+getSalary());
	}

}
