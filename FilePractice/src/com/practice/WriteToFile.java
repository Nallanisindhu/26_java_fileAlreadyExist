package com.practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		try {
		FileWriter rite=new FileWriter("D:\\01CJ\\sindhu.txt");
		rite.write("this is FileWriter demo");
		rite.close();
		}catch(IOException e) {
			System.out.println("An error occured ");
		}
		File f=new File("D:\\01CJ\\sindhu.txt");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println("size:"+f.length()+"bytes");
	}

}
