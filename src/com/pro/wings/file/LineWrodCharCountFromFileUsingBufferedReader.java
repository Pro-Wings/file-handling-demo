package com.pro.wings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineWrodCharCountFromFileUsingBufferedReader {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		try {
			
			reader = new BufferedReader(new FileReader(new File("C:/Users/Shree/eclipse-workspace/file handling demo/abc.txt")));
			
			String line = reader.readLine();
			
			while(line != null)
			{
				lineCount++;
				line = line.trim();
				String[] words = line.split(" ");
				wordCount += words.length;
				for(String word : words)
				{
					charCount += word.length();
				}
				line = reader.readLine();
			}
			System.out.println("lineCount :"+lineCount);
			System.out.println("wordCount :"+wordCount);
			System.out.println("charCount :"+charCount);
						
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
