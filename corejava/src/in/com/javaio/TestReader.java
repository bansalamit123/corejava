package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestReader {
	public static void main(String[] args) throws Exception   {
		FileReader  reader=new FileReader("C:\\Users\\Amit\\Desktop\\Hello.java\\hello.txt");
		int ch=reader.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=reader.read();
		}
		reader.close();
	}

}
