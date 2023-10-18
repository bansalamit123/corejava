package in.com.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream1 {
	public static void main(String[] args) {
		
//		ArrayList<Integer>list=new ArrayList<Integer>();
//		list.add(106);
//		list.add(50);
//		list.add(51);
//		list.add(32);
//		list.add(100);
//		list.add(99);
//		list.add(76);
//		System.out.println(list);
	/*	List<Integer>evenlist=new ArrayList<Integer>();
		for(Integer i:list) {
		
			if(i%2==0)
				evenlist.add(i);
		}
		System.out.println(evenlist);*/
	/*	List<Integer>newlist=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);*/
	/*	Stream<Integer>s=list.stream();
		List<Integer>newlist=s.filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(newlist);*/
	/*	Stream<Integer>s2=list.stream();
		List<Integer>newlist1=s2.filter(i->i>50).collect(Collectors.toList());
		System.out.println(newlist1);*///lemda true return krta hai
//		List<Integer>newlist1=list.stream().filter(e->e>50).collect(Collectors.toList());
//		System.out.println(newlist1);
		//Generate blank stream
	/*	Stream<Object>emptyStream=Stream.empty();
		emptyStream.forEach(e->{
			System.out.println(e);
		});*/
		/*String[]names= {"Durgesh","Uttam","Ankit","Divya"};
		Stream<String>stream1=Stream.of(names);//this place can store direct value of name
		stream1.forEach(e->{
			System.out.println(e);
		});*/
	//	Stream<Object>streamBuilder=Stream.builder().build();
		/*IntStream stream=Arrays.stream(new int[] {2,4,6,78});
		stream.forEach(e->{
			System.out.println(e);
		});*/ 
		
		// List,set
		List<Integer>list2=new ArrayList<>();
		list2.add(12);
		list2.add(45);
		list2.add(34);
		list2.add(78);
		Stream<Integer>stream2=list2.parallelStream();
		stream2.forEach(e->{
			System.out.println(e);
			
		});
		
		
		
	}

}
