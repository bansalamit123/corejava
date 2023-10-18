package in.com.collectionframwork;

public class Employee1 implements Comparable <Employee1> {
	private int empid;
	private String name;
	private String phone;
	public Employee1(int empid,String name,String phone) {
		this.empid=empid;
		this.name=name;
		this.phone=phone;
		
		
	}
	public int compareTo(Employee1 o) {
		return this.empid-o.empid;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return empid+ " "+name+" "+phone;
    }
	

}
