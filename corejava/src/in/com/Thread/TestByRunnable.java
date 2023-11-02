package in.com.Thread;

public class TestByRunnable {
	public static void main(String[] args) {
		Thread t1=new Thread(new ByRunnable("India"));
		Thread t2=new Thread(new ByRunnable("South Africa"));
	   t1.start();
        t2.start();
//		t1.run();
//		t2.run();
		t1.setPriority(5);
		t2.setPriority(10);
		
		
	}

}
