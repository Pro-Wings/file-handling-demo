package com.pro.wings.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineWrodCharCountFromFile {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("C:/Users/Shree/eclipse-workspace/file handling demo/abc.txt");
		
		try {
			
			List<String> lines = Files.readAllLines(path);
			
			System.out.println("Total number of lines : "+lines.size());
			
			List<String> words = new ArrayList<>();
			int charCount =0;
			for(String line : lines)
			{
				line = line.trim();
				words.addAll(Arrays.asList(line.split(" ")));
			}
			
			System.out.println("Total number of words : "+words.size());
			
			for(String word : words)
			{
				charCount += word.length();
			}
			System.out.println("Total number of characters : "+charCount);
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
