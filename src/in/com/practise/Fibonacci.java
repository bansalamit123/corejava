package in.com.practise;
import java.util.*;

public class Fibonacci {
	Scanner sc=new Scanner(System.in);
	 //Method-1
	public void driver() {
	System.out.println("Enter a number");
	
	int n=sc.nextInt();
	int firstTerm=0,secondTerm=1;
	for(int i=1;i<=n;i++) {
		System.out.print(firstTerm+",");
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		
	}
	
	}
	public void Fabinocci2() {
		int a=0,b=1,c;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
		
	}
	
	
}
