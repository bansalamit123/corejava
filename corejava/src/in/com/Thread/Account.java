package in.com.Thread;

public class Account {
	private int balance=0;
	
	public int getBalance() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		return balance;
	}
    public void setBalance(int balance) {
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
			}
    	this.balance=balance;
    }
    public synchronized void deposite(String name,int amount) {
    	int total=getBalance()+amount;
    	setBalance(total);
    	System.out.println(name+" "+getBalance());
    }
}
