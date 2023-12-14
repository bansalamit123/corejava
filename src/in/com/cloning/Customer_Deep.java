package in.com.cloning;

public class Customer_Deep implements Cloneable {
	String cust_name;
	Bank_Deep b=new Bank_Deep();
	public Customer_Deep(String cust_name,int bank_id) {
	this.cust_name=cust_name;
	this.b.bank_id=bank_id;
	
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer_Deep c4=(Customer_Deep) super.clone();
		c4.b=(Bank_Deep)b.clone();
       return c4;
       
	}

}
