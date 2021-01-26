package com.practice;
import java.io.File;


public class FileDemo {

	public static void main(String[] args) {
		File f=null;
	String v;
	
		f=new File("D:\\01CJ\\constructor");
		v=f.getName();
	
	
		System.out.println("filename:"+v);
		System.out.println("filesize in bytes:"+v.length());
		
	}

}
