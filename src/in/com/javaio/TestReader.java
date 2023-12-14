package in.com.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestReader {
	public static void main(String[] args) throws Exception   {
	/*	FileReader  reader=new FileReader("C:\\Users\\Amit\\Desktop\\Hello.java\\hello.txt");
		int ch=reader.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=reader.read();
		}
		reader.close();*/
		
		//First approach
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		char[]ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		System.out.println("**************");
		//Second approach
		FileReader fr1=new FileReader ("abc.txt");
		int i=fr1.read();
		while(i!=-1) {
			System.out.print((char)i);
			//i=fr1.read();
			
		}
		
		
		
	}

}
