package in.comfinnalyexception;

public class TextLoginException {
	public static void main(String[] args) {
		String name="admin";
		if(name.equals("dmin")) {
			System.out.println("Yes valid user");
			
		}
		else {
			LoginException e  =new LoginException();
			try {
				throw e;
				
			}catch (LoginException p2) {
				System.out.println(p2);
			
		}
		
	}

	}
}
