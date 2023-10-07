package in.com.cloning;

public class Bank {
	String name;
	Account a =new Account();
	public Bank(int balance,String name) {
		this.name=name;
		this.a.balance=balance;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
