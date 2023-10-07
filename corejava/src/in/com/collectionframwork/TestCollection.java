package in.com.collectionframwork;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("This is a Collection Framwork ");
	//	c1.add(10);
		//c1.add('A');
		c1.add("This is array");
		System.out.println(c1);
		System.out.println(c1.size());
		/*for(Object ele:c) {
			System.out.println(ele);
		}
			Object[] oArray=c.toArray();
			for (Object ele1: oArray) {
				String s =(String) ele1;
				System.out.println(s);
			}*/
			Collection c2=new ArrayList();
			c2.add("Amit");
			c2.add(1000);
			//c1.addAll(c2);
			System.out.println(c1);
			//c1.clear();
			//System.out.println(c1);
			boolean b =c2.contains("Amit");
			
			System.out.println(b);
//			System.out.println(c1);
//			System.out.println(c2);
         	c1.addAll(c2);
			System.out.println(c2.containsAll(c1));
			c1.clear();
			 boolean b1=c1.isEmpty();
			System.out.println(b1);
			c1.iterator()
		}
		
		
	}


