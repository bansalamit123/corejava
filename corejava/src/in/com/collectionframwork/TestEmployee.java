package in.com.collectionframwork;
import java.util.*;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Amit","Bhopal");
Employee e2=new Employee(2,"Lavish","Indore");
	
	ArrayList list=new ArrayList();
	list.add(e1);
	list.add(e2);
	System.out.println(list);
	
	

}
}