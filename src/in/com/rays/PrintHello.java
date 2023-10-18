package in.com.rays;

public class PrintHello {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(89765);
		e.setName("Amit");
		e.setSalary(50000);
		e.setAccount(37678);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getAccount());
		Person p=new Person();
		p.setName("Raj");
		p.setSalary(40000);
		System.out.println(p.getName());
		System.out.println(p.getSalary());
		
	}

}
