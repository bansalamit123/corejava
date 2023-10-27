package in.com.comparator;
import java.util.*;

public class TestEmployee {
	public static void main(String[] args) {
		
	ArrayList<Employee> emp=new ArrayList<Employee>();
	emp.add(new Employee(2,"hariom","12345"));
	emp.add(new Employee(7,"amit","123"));
	emp.add(new Employee(4,"himanshu","345"));
	emp.add(new Employee(1,"rahul","09345"));
	emp.add(new Employee(0,"ram","96547"));
	System.out.println(emp);
	Collections.sort(emp,new Comparatorbyid());
	System.out.println(emp);
//	ArrayList<Employee> empn=new ArrayList<Employee>(emp);
//	Collections.sort(empn,new Comparatorbyname());
//	System.out.println(empn);
//	ArrayList <Employee>empp=new ArrayList<Employee>(emp);
//	Collections.sort(empp,new Comparatorbyphone());
//	System.out.println(empp);
//	

}
}