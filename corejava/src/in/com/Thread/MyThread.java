package in.com.Thread;

public class MyThread  implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("My Values"+" "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
				
			}
		}
		
	}

}
