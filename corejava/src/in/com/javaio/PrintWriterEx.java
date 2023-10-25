package in.com.javaio;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) throws IOException {
	/*	FileWriter file=new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\name.txt");
		PrintWriter out=new  PrintWriter(file);
		out.println("Hello Everyone");
		out.println("how are you");
		out.println("what's going on");
		System.out.println("Data write Sucessfully!!!");
		file.close();
		out.close();*/
		
		
		
		PrintWriter pw=new PrintWriter("abc2.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("durga");
		pw.flush();
		pw.close();
		
		
		
	}

}
