package com.pro.wings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;

public class ReadFileFromClasspath2 {
	
	public static void main(String[] args) throws IOException {
		
		ReadFileFromClasspath2 obj = new ReadFileFromClasspath2();
		obj.getFile();
		
		
	}

	private void getFile() throws IOException {
	
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("abc.txt");
		
		InputStreamReader streamReader = new InputStreamReader(inputStream);
		
		BufferedReader reader = new BufferedReader(streamReader);
		
		System.out.println(reader.readLine());
	}

}
