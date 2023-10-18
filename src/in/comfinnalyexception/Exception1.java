package in.comfinnalyexception;

public class Exception1 {
	public static void main(String[] args) {
		int a=10,b=5;
		try {
			String name="Amit";
			System.out.println(name.charAt(3));
			} catch(Exception e) {
				System.out.println(e);
				
			}
finally {
			System.out.println("Exeption ho ya nahi but finally chalega");
		}
		
	}

}
