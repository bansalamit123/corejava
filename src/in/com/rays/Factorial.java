package in.com.rays;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=1;
		while(0<i) {
			j=j*i;
			i--;
		}
		System.out.println(j);
		
		
		
		
		
	}

}
