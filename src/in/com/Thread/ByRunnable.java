package in.com.Thread;

public class ByRunnable implements Runnable {
	String name;
	public ByRunnable(String name) {
		this.name=name;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<=10;i++) {
			System.out.println(name+" "+i);
		}
		
	}

}
