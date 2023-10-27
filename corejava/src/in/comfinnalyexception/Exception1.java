package in.comfinnalyexception;

public class Exception1 {
	public static void main(String[] args) {
		int a=0,b=5,c;
		//String name="Amit";
		
		try {
			String name="Amit";
			
			c=b/a;
			
			
	System.out.println(name.charAt(8));
		System.out.println(name.length());
		System.out.println(c);	
		
			} catch(Exception e) {
			System.out.println(e);
				
		}
finally {
			System.out.println("Exeption ho ya nahi but finally chalega");
		}
		
	}

}
