package in.com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInput {
	public static void main(String[] args) throws IOException {
		FileInputStream in =new FileInputStream("C:\\Users\\Amit\\Desktop\\Hello.java\\Rays.jpg");
		//FileOutputStream out=new FileOutputStream("C:\\Users\\Amit\\Desktop\\Hello.java\\Thar.txt");
		FileOutputStream out=new FileOutputStream("C:\\Users\\Amit\\Desktop\\Hello.java\\Thar.jpg");
		int ch=in.read();
		while(ch!=-1) {
			out.write(ch);
			ch=in.read();
			
		}
		in.close();
		out.close();
		System.out.println("Data sucess fully!!");
		
	}
	

}
