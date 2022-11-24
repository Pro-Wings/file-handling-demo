package com.pro.wings.file;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/Shree/Desktop/myfilehandling/abc.txt");
		File file1 = new File("C:/Users/Shree/Desktop/myfilehandling/abc");
		try
		{
			file1.mkdir();
			
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File created successfully!!");
			}
			else
				System.out.println("file already exits!!");
		}
		catch (IOException e) {
			System.out.println("some error while working on file!!!");
			e.printStackTrace();
		}
	}

}
