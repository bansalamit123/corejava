package in.com.collectionframwork;
 import java.util.*;

public class Vector1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add("Ram");
		System.out.println(v);
		Enumeration e=v.elements();
		v.add("Amit");
		v.add(901);
		v.add("Java");
		System.out.println(v);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
