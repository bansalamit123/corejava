package in.com.Thread;

public class TestRacing {
	public static void main(String[] args) {
		Racing r1=new Racing ("Hariom");
		Racing r2=new Racing ("Ram");
		r1.start();
		r2.start();
		
	}

}
