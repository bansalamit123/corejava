package in.com.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) throws IOException {
		FileWriter writer =new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\amit.txt");
		writer.write("Hello i am fine how are you");
		writer.close();
		System.out.println("Data write sucessfully!!!");
		
		
	}

}
