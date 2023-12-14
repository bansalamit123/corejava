


package in.com.exception;

public class Exception2 {
	public static void main(String[] args) {
		String name="Lokesh";
		try {
			System.out.println(name.charAt(8));
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
