package in.comfinnalyexception;

public class TextLoginException {
	public static void main(String[] args) {
		String name="admin";
		if(name.equals("dmin")) 
			System.out.println("Yes valid user");
			
		else {
			LoginException e  =new LoginException();
			try {
				throw new LoginException();
				
			}catch (LoginException g) {
				System.out.println("invelid password");
			
		}
		
	}

	}
}
