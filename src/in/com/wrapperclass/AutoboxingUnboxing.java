package in.com.wrapperclass;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		
	int a=10;
	Integer b=new Integer(a);  //Auto boxing
	
	System.out.println(a);
	System.out.println(b);
	Integer c=new Integer(20);//unboxing
	int d=c;

	System.out.println(c);
	System.out.println(d);
	
	
		

}
}