package in.com.Thread;

public class TestWithoutThread {
	public static void main(String[] args) {
		WithoutThread wt1=new WithoutThread("Amit");
		WithoutThread wt2=new WithoutThread("Bansal");
		wt1.run();
		wt2.run();
		
	}
	

}
