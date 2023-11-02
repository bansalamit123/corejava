package in.com.Thread;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread my=new MyThread();
		MyAnotherThread mt=new MyAnotherThread();
		Thread t=new Thread(my);
		
		t.start();
		mt.start();
		

	}

}
