package com.practice;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class createNewFile {

	public static void main(String[] args) {
		

		    // create a file object 
		    File file = new File("D:\\01CJ\\sindhu.txt");

		    try {

		      // create a file based on the object
		      boolean value = file.createNewFile();
		      FileWriter fw=new FileWriter(file);
		      fw.write("this is new filecreation and \n filewriter demo");
		      fw.close();
		      if (value) {
		        System.out.println(" New File is Created.");
		      }
		      else {
		        System.out.println(" File Already Exists.");
		      }
		    }
		    catch(IOException e) {
		     System.out.println("An error occured");
		    }
		  }
		
	}


