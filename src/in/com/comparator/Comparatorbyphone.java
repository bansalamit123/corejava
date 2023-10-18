package in.com.comparator;
import java.util.*;

public class Comparatorbyphone implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getPhone().compareTo(o2.getName());
	}


}
