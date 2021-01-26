package com.practice;
import java.io.*; 


public class JavaFilesCopy {
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
		FileInputStream fis=new FileInputStream("D:\\01CJ\\sindhu.txt");
		FileOutputStream fos=new FileOutputStream("D:\\01CJ\\vishal.txt");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
			
			
		}
		fis.close();
		fos.close();
		System.out.println("file copied" );
		}catch(IOException e) {
	System.out.println("An error occured");
	
	
	}
	}
}

