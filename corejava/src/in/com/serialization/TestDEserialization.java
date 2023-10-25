package in.com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDEserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in=new FileInputStream("C:\\\\Users\\\\Amit\\\\Desktop\\\\Hello.java\\\\obj.txt");
	ObjectInputStream out=new ObjectInputStream (in);
	Marksheet m=(Marksheet) out.readObject();
	System.out.println("id="+m.id);
	System.out.println("name="+m.name);
	System.out.println("java"+m.java);
	System.out.println("python="+m.python);
	System.out.println("css="+m.css);
	System.out.println("html="+m.html);
	System.out.println("javascript="+m.javascript);
	System.out.println("Total="+m.total);
	
	

}
}