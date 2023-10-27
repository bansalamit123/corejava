package in.com.exception;

public class Exception3 {
	public static void main(String[] args) {
		String name="Bansal";
		int a=10,b=0,c;
		try {
			System.out.println(name.charAt(3));
			c=a/b;
			System.err.print(c);
			
			//System.out.println(name.length());
			//System.out.println(c);
			
		}catch(Exception e ) {
			System.out.println(e);
			e.printStackTrace();
			
		}
		finally{
			try {
				String name1="Himanshu";
				System.out.println(name1.charAt(10));
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
				e2.printStackTrace();
			}
			System.out.println("Allways executed");
			
		}
		
	}
	

}
