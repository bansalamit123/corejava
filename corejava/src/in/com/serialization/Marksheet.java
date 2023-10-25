package in.com.serialization;

import java.io.Serializable;

public class Marksheet implements Serializable{
	//transient internally hide karta h 
	public int id=0;
	public String name=null;
	public int java=0;
	public int  python=0;
	public int html=0;
	public transient int css=0;
	public int javascript=0;
	public int total=0;
	
	

	
	

}
