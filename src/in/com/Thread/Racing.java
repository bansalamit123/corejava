package in.com.Thread;

public class Racing extends Thread {
	String name;
	static Account ac=new Account();
	public Racing (String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0;i<=3;i++) {
			this.ac.deposite(name,10);
		}
		

}
}
