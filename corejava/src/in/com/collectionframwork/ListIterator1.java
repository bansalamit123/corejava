package in.com.collectionframwork;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIterator1 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add("Amit");
		l.add("Nancy");
		ListIterator<Comparable> li=l.listIterator();
	while(li.hasNext()) {
			System.out.println(li.next());
	}
//		 li.next();
//		li.next();
//		li.next();
	System.out.println("------------");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	//	l.remove("Nancy");
	//	System.out.println(l);
		li.set(200);
		System.out.println(l);
		
		
		
	}

}
