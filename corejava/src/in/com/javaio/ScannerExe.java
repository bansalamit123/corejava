package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

public class ScannerExe {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader=new FileReader("C:\\Users\\Amit\\Desktop\\Hello.java\\hello1.txt");
		Scanner sc=new Scanner(reader);
		while(sc.hasNext()) {// method return type is boolean
			System.out.println(sc.nextLine());
			
			
		}
		sc.close();
		
	}

}
