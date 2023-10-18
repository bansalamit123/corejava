
package in.com.rays;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private int account;
	
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setSalary(float salary) {
		this.salary=salary;
		
	}
	public float getSalary() {
		return salary;
	}
	public void setAccount(int account) {
		
	this.account=account;
	
	}
	public int getAccount() {
		return account;
	}
	
	}
 class Person extends Employee{
	private String name;
	private float salary;
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setSalary(float salary) {
		this.salary=salary;
		
	}
	public float getSalary() {
		return salary;
		
	}
	
	
}
