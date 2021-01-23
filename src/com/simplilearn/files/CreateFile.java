package com.simplilearn.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
	private static void createFileClass() {
		String rootDirectory = "D:\\LVC Simplilearn\\Folder1";
		//Create file instance
		File file = new File(rootDirectory, "yetAnotherFile.png");
		FileWriter fileWriter = null;
		try {
			if(file.createNewFile()) 
				System.out.println("File created!");
			else
				System.out.println("File already exists!");
			fileWriter = new FileWriter(file);
			fileWriter.write("Test data 1 !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect file path!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void createUsingFOS() {
		String data = "Test data";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("D:\\LVC Simplilearn\\Folder1\\test2.txt");
			out.write(data.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Written successfully!");
	}
	
	
	private static void createUsingNIO() {
	//	String data = "Test data";
		Path path = Paths.get("D:\\LVC Simplilearn\\Folder1\\test4.txt");
		List<String> strings = Arrays.asList("1st Line", "2nd line");
		try {
			Files.write(path, strings, StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File created!");
		
	}

	
	
	public static void main(String[] args) {
		createFileClass();
		//createUsingFOS();
		//createUsingNIO();

	}

}
