package in.comfinnalyexception;

public class LoginException extends RuntimeException  {
	 public LoginException(String name) {
		// TODO Auto-generated constructor stub
		 super();
		 System.out.println("invalid syntax plz check your syntax");
		
	}
	  public LoginException() {
		// TODO Auto-generated constructor stub
		  this("invalid");
	}

}
