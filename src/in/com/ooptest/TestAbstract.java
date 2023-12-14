package in.com.ooptest;

public class TestAbstract {
	public static void main(String[] args) {
		Car c=new Car() {
			int a;
			String name;
        	  
			@Override
			public void f2(int a, String name) {
				// TODO Auto-generated method stub
			
				this.a=a;
				this.name=name;
				System.out.println("name is "+name+" "+a);
				
			}
			
			
		};
		
		c.f1();
		c.f2(10,"amit");
		Shap s=new Shap() {
			
		}
		
		
	}

}
