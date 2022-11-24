package com.pro.wings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;

public class ReadFileFromClasspath {
	
	public static void main(String[] args) throws IOException {
		
		ReadFileFromClasspath obj = new ReadFileFromClasspath();
		obj.getFile();
		
		
	}

	private void getFile() throws IOException {
	
		String encodedUrl = this.getClass().getClassLoader().getResource("abc.txt").getFile();
		String pathName = URLDecoder.decode(encodedUrl, "UTF-8");
		File file = new File(pathName);
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println(line);
	}

}
