package in.com.polymorphism;

public class MethodOverloading {
	public void read() {
		System.out.println("Students read book");
	}
	public void read(int price,String bname) {
		System.out.println("Book price and name"+price);
		System.out.println("book name:"+bname);
		
	}
	public void read(int page ,String bname,String bcolour) {
		System.out.println("book page"+page);
		System.out.println("book name"+bname);
		System.out.println("book colour"+bcolour);
		
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.read();
		m.read(100,"java");
		m.read(300,"java","red");
		
		
	}
	
	

} 
