package in.com.comparator;
import java.util.ArrayList;
import java.util.Collections;
public class TestComparableEx {
	public static void main(String[] args) {
		ArrayList<ComparableEx>e=new ArrayList<ComparableEx>();
		e.add(new ComparableEx(4,"am","6678"));
		e.add(new ComparableEx(2,"sm","6678"));
		e.add(new ComparableEx(1,"km","6678"));
		System.out.println(e);
		Collections.sort(e);
		System.out.println(e);
		
	}

}
