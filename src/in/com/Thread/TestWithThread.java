package in.com.Thread;

public class TestWithThread {
	public static void main(String[] args) {
		WithThread wt=new WithThread("Python");
		WithThread wt1=new WithThread("Java");
//		wt.setPriority(1);
//		wt1.setPriority(10);
     	wt.start();
		wt1.start();
		
		
	} 
	

}
