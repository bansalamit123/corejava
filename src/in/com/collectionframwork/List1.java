package in.com.collectionframwork;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class List1 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);//index based data structure,allow duplicate element
		l.add(1,40);
		l.add(200);
		l.add(100);
		l.add(200);
		l.add(10);
		l.add(null);
		l.add(null);//list can store any null values
		System.out.println(l);
		Iterator itr=l.iterator();
	/*	while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}*/
		ListIterator litr=l.listIterator();
		while(itr.hasNext()) {
			System.out.println(litr.next());
			
		}
		
		
		
		
	}

}
