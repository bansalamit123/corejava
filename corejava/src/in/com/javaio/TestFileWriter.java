package in.com.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
	/*	FileWriter wrt =new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\amit.txt");
		wrt.write("Hello i am fine how are you");
		wrt.close();
		System.out.println("Data write sucessfully!!!");*/
		
		  
		FileWriter fw=new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\abc.txt");
		
		fw.write(100);
		fw.write("urga\nSoftware Solution");
		fw.write("\n");
		char[]ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write("\n");
		//fw.flush();
		fw.close();
		//due to pass true we will run again to again then data copy again
		FileWriter fw1=new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\abc.txt",true);
		
	}

}
