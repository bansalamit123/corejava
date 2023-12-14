package in.com.cloning;

public class Deep_Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer_Deep cd=new Customer_Deep("Amit", 102);
		Customer_Deep cd2=(Customer_Deep) cd.clone();
				                  
		cd2.cust_name="Himanshu";
		cd2.b.bank_id=222;
		System.out.println(cd.cust_name);
		System.out.println(cd.b.bank_id);
		System.out.println(cd2.cust_name);
		System.out.println(cd2.b.bank_id);
	}
	

}
