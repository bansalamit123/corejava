package in.com.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		
	//	filter(Predicate)
		//boolean value function
		//e->e>10(true or false)
		
		
		//map(function)//
		//each element Opearation
		//Return the map value
	/*	List<String>name=List.of("Aman","Ankit","Abhinav","Durgesh");
		List<String>newNames=name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
	
		System.out.println(newNames);*/
		
		List<Integer>numbers=List.of(23,4,3,6,7);
		List<Integer>newnumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(newnumbers);
		numbers.stream().forEach(e->{
				
					System.out.println(e);
				}
		);
		
		newnumbers.stream().forEach(System.out::println);
		
		//sort
		numbers.stream().sorted().forEach(System.out::println);
		Integer integer=numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min "+integer);
		
		Integer integer1=numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max"+integer1); 
		List<Integer>num=List.of(1,2,3,4,1,2,3,4,3,4);
		// print unique value
		List<Integer>newnum=num.stream().distinct().collect(Collectors.toList());
		System.out.println(newnum);
		
		
		
	}
	

}
