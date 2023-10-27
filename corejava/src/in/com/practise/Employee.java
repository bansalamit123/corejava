package in.com.practise;

public class Employee {
	int id;
	String name;
	String phone;
	public Employee(int id,String name,String phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
		
		
	}
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
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
		
	}
	public String toString() {
		return id+" "+name+" "+phone;
		
	}
	

}
