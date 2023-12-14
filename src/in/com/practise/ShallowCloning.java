package in.com.practise;


public class ShallowCloning implements Cloneable{
	int balance;
	public ShallowCloning(int balance) {
		this.balance=balance;
		
	}
	@Override
	public String toString() {
		
		return ""+balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning s=new ShallowCloning(100);
		ShallowCloning s1=(ShallowCloning)s.clone();
		s1.balance=200;
				System.out.println(s);
		System.out.println(s1);
		
		
		
	}

}
