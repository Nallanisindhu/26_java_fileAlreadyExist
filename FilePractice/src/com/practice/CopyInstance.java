package com.practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CopyInstance {

	public static void main(String[] args) throws IOException{
		try {
		File f=new File("D:\\01CJ\\Vishal.txt");
		System.out.println("filename:"+f.getName());
		System.out.println("read:"+f.canRead());
		System.out.println("write:"+f.canWrite());
		System.out.println("path:"+f.getAbsolutePath());
		
		
		FileWriter fw=new FileWriter(f);
		fw.write("hi this is file practise demo");
		//fw.wait(10);
		fw.close();
		}
		catch(IOException e){
System.out.println("an error occured");
	}

}
}