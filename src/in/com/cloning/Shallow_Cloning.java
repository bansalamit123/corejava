

package in.com.cloning;

public class Shallow_Cloning implements Cloneable {
	int balance;
	public Shallow_Cloning(int balance) {
	this.balance=balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
