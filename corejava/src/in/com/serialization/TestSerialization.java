package in.com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream in=new FileOutputStream("C:\\Users\\Amit\\Desktop\\Hello.java\\obj.txt");
		ObjectOutputStream out=new ObjectOutputStream(in);
		Marksheet m=new Marksheet();
		m.id=1;
		m.name="hariom";
		m.java=76;
		m.python=78;
		m.html=91;
		m.css=74;
		m.javascript=32;
		m.total=m.java+m.python+m.html+m.css+m.javascript;
		out.writeObject(m);
		in.close();
		out.close();
		System.out.println("object convert into bytstream sucessfully!!!!");
		
		
	}
	

}
