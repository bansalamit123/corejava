package in.com.comparator;

public class ComparableEx implements Comparable<ComparableEx>{
	int id;
	String name;
	String phone;
	public ComparableEx(int id,String name,String phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
		}
	@Override
	public int compareTo(ComparableEx o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
		
	}
	public String toString() {
		return id+" "+name+" "+phone;
		
	}
	

}