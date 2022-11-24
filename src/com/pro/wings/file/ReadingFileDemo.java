package com.pro.wings.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadingFileDemo {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/Shree/eclipse-workspace/file handling demo/abc.txt");
		BufferedReader br = null;
		FileReader fr = null;
		try {
			
			fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			
			System.out.println("data from file : "+data);
			System.out.println("data written to file successfully");
		}
		catch (IOException e) {
			System.out.println("error while writing data into file!!");
			e.printStackTrace();
		}
		finally {
			
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
