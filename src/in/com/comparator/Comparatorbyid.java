package in.com.comparator;
import java.util.*;

public class Comparatorbyid implements Comparator<Employee>{
	
public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}}
