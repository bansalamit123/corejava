package in.com.collectionframwork;
import java.util.*;
import java.util.ArrayList;

public class Iterator1 {
	public static void main(String[] args) {
		
	Collection c1=new ArrayList();
	c1.add("Amit");
	c1.add(101);
	c1.add("Rahul");
	System.out.println(c1);
	Iterator it =c1.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	c1.remove("Rahul");
	System.out.println(c1);
	
	
	}

}
