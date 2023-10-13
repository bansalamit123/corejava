package in.com.collectionframwork;

public class Employee {
	private String name=null;
	private int id=0;
	private String address=null;
	public Employee(int id,String name,String address) {
		this.id=id;
		this.name=name;
	this.address=address;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" " +name+" "+address;
	}
 
}
