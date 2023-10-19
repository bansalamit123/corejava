
package in.com.javaio;

import java.io.*;


public class FileExE {
	public static void main(String[] args) throws IOException  {
		//check this file exists if exists then print true or false
//		File f=new File("abc.txt");  //File name
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists()); 
//		
		//check this Directory exists if exists then print true or false
		
		 /*File f =new File("durgesh123");  //directory name
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());*/
		
	// Print the Names of All Files and sub-Directory present in path	
	/*int count =0;
	File f=new File("C:\\Rays software\\Workspace\\Core Workspace\\corejava");
	String[]s=f.list();
	for(String s1:s) {
		count++;
		System.out.println(s1);
	}
	System.out.println("The Total Number"+count);*/
	
	//To Display only file name
	int count =0;
	File f=new File("C:\\Rays software\\Workspace\\Core Workspace\\corejava");
	String[]s=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		if(f1.isFile()) {
			count++;
			System.out.println(s1);
		}
	System.out.println("The Total Number:"+count);
		
		
	
	//To display only directory Names
	int count =0;
	File f=new File("C:\\Rays software\\Workspace\\Core Workspace\\corejava");
	String[]s=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		if(f1.isDirectory()) {
			count++;
			System.out.println(s1);
		}
	
	}
	System.out.println("The Total Number:"+count);
	
	
	}

}
