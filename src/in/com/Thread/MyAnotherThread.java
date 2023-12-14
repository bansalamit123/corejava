package in.com.Thread;

public class MyAnotherThread extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("My Another Thread "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
