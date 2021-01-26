package com.practice;
import java.io.File;
import java.io.FileWriter;
public class CreateFile {
//public class FileToWrite{

	public static void main(String[] args) {
		File f=new File("D:\\01CJ\\sindhu.txt");
		//FileWriter writer=new FileWriter("D:\\01CJ\\sindhu.txt");
		
		
		System.out.println("filecreated:"+f.getName());
		System.out.println(f.getAbsolutePath());

	}

}
