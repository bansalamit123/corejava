package in.com.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class practise {
	public static void main(String[] args) throws IOException {
		/*FileReader rd=new FileReader("C:\\Users\\Amit\\Desktop\\amit\\name.txt");
		int ch=rd.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=rd.read();
		}
		rd.close();*/
		
		System.out.println("Enter here your text ");
		InputStreamReader in=new InputStreamReader(System.in);
		
		BufferedReader out=new  BufferedReader(in);
		FileWriter writr=new FileWriter ("C:\\Users\\Amit\\Desktop\\amit\\this.txt");
		PrintWriter pr=new PrintWriter(writr);
		String line=out.readLine();
		while(!(line.equals("Tata"))) {
			pr.println(line);
			line=out.readLine();
			
		}
	out.close();
	pr.close();
	writr.close();		
		System.out.println("Your compiler is closed");
		
		
		
	
		
		
	}

}
