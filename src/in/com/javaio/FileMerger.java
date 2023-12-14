package in.com.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {
	public static void main(String[] args) throws IOException {
		//write a program merge data from two files into 3 file
		/*PrintWriter pw=new PrintWriter("C:\\Users\\Amit\\Desktop\\amit\\file3.text");
		BufferedReader br=new BufferedReader (new FileReader("C:\\Users\\Amit\\Desktop\\amit\\file1.txt"));
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		 br=new BufferedReader (new FileReader("C:\\Users\\Amit\\Desktop\\amit\\file2.txt"));
		 line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();*/
		
		
		
		//File Merge Operation Where Merging should be done by line by line alternatively
		
	/*	PrintWriter fw=new PrintWriter("C:\\Users\\Amit\\Desktop\\amit\\File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\Amit\\Desktop\\amit\\file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\Amit\\Desktop\\amit\\file2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while((line1!=null)||(line2!=null)) {
			if(line1!=null) {
				fw.println(line1);
				line1=br1.readLine();
				
			}
			if(line2!=null) {
				fw.println(line2);
				line2=br2.readLine();
			
			
		}
	}
		
		fw.flush();
		br1.close();
		br2.close();
		fw.close();*/
		
		
		//Merge Data from All.text Files present in E:\\input into output.txt
		PrintWriter pw=new PrintWriter("output.txt");
		File f=new File("C:\\Users\\Amit\\Desktop\\amit");
		String[]s=f.list();
		for(String s1:s) {
			BufferedReader br=new BufferedReader(new FileReader(new File(f,s1)));
			String line=br.readLine();
			while(line!=null) {
				pw.println(line);
				line=br.readLine();
			}
		}
		pw.flush();
		
		
		

}
}