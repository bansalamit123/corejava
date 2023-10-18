package in.com.collectionframwork;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionShort {
	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(75);
		marks.add(30);
		marks.add(70);
		marks.add(50);
		marks.add(99);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
	}

}
