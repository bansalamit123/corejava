package in.com.javaio;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ByKeybord {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter here your text>>>>>>");
		InputStreamReader isReader=new InputStreamReader(System.in);
		BufferedReader in=new  BufferedReader(isReader);
		FileWriter writer=new FileWriter("C:\\Users\\Amit\\Desktop\\Hello.java\\ByKeybord.txt");
		PrintWriter out=new PrintWriter(writer);
		String line=in.readLine();
		while(!(line.equals("tata"))){
			out.println(line);
			line=in.readLine();
			
			}
		System.out.println("your Compiler is closed");
		isReader.close();
		in.close();
		writer.close();
		out.close();
				
		
	}

}
