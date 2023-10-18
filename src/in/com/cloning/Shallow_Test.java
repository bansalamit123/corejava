package in.com.cloning;

public class Shallow_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	Shallow_Cloning s=new Shallow_Cloning(101);
	Shallow_Cloning s1=(Shallow_Cloning) s.clone();
	s1.balance=304;
	System.out.println(s.balance);
	System.out.println(s1.balance);

	}

}
