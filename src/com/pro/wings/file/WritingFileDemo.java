package com.pro.wings.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WritingFileDemo {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/Shree/eclipse-workspace/file handling demo/abc.txt");
		BufferedWriter br = null;
		FileWriter fr = null;
		try {
			
			fr = new FileWriter(file, true);
			
//			br = new BufferedWriter(fr);
			
//			fr.write("Java is language"); 
			fr.append(" hello"); 
			
			System.out.println("data written to file successfully");
		}
		catch (IOException e) {
			System.out.println("error while writing data into file!!");
			e.printStackTrace();
		}
		finally {
			
			try {
//				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
