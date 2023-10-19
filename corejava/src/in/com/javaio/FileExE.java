
package in.com.javaio;

import java.io.*;


public class FileExE {
	public static void main(String[] args) throws IOException  {
	/*	File f=new File("abc.txt");  //File name
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists()); */
		
		
	File f =new File("durgesh123");  //directory name
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());
	
	
		
		
	}
	
	
	

}
