package in.com.collectionframwork;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;

public class Set1 {
	public static void main(String[] args) {
		Set s=new HashSet();//not an index based element,does not allow duplicate elemnt
		s.add(100);
		s.add(20);
		s.add(4);
		s.add(null);
		s.add(null);//set can not store duplicate null
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
