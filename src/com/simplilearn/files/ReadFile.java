package com.simplilearn.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	private List<String> readContents() {
		List<String> lines = new ArrayList<>();
		try {
			Path path = Paths.get("D:\\LVC Simplilearn\\Folder1\\test4.txt");
			lines = Files.readAllLines( path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
	
	private static void readFiles() {
		File file = new File("D:\\LVC Simplilearn\\Folder1");
		File[] files = file.listFiles();
		System.out.println("No. of files : " + files.length) ;
		for(File eachFile : files) {
			if(eachFile.isDirectory()) {
				File[] folderFiles = eachFile.listFiles();
				for(File fl : folderFiles) {
					System.out.println(fl.getName());
				}
			} 
			else 
				System.out.println(eachFile.getName());
		}
	}

	public static void main(String[] args) {
		ReadFile file = new ReadFile();
		List<String> lines = file.readContents();
		for(String line : lines) {
			System.out.println(line);
		}
		System.out.println("***************************");
		readFiles();
	}

}
