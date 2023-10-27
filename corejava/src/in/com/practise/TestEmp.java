package in.com.practise;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList <Employee>l=new ArrayList<Employee>();
		l.add(new Employee(2,"amit","12345"));
		l.add(new Employee(6,"sumit","63678"));
		l.add(new Employee(1,"ram","123"));
		System.out.println(l);
//		Collections sort.(l, new Comparatorbyid());
//		System.out.println(l);
		
//		Collections.sort(l , new Comparatorbyid());
//		System.out.println(l);
		
		ArrayList<Employee>empn=new ArrayList<Employee>(l);
		Collections.sort(empn,new Comparatorbyname());
	}

}
