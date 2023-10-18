package in.com.collectionframwork;
import java.util.*;

public class TestEmployee1 {
	public static void main(String[] args) {
		ArrayList<Employee1>e1=new ArrayList<Employee1>();
		
		e1.add(new Employee1 (1,"ankit","7487578"));
		e1.add(new Employee1 (3,"bnkit","747384"));
		
		e1.add(new Employee1 (7,"dnkit","75766"));
		
		e1.add(new Employee1 (5,"lnkit","74"));
		System.out.println(e1);
		Collections.sort(e1);
		System.out.println(e1);
	
		
		
	}

}
