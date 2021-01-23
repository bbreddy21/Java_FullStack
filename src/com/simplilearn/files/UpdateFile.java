package com.simplilearn.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UpdateFile {

	private void modify(String filePath, String oldString, String newString) {
		try {
			List<String> newList = new ArrayList<>();
			List<String> list = Files.readAllLines(Paths.get(filePath));
			for (String eline : list) {
				String modifiedLine = eline.replaceAll(oldString, newString);
				newList.add(modifiedLine);
			}
			Files.write(Paths.get(filePath), newList, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File modified!");
	}
	
	private void modifyUsingFile(String filePath, String oldString, String newString) {
		File file = new File(filePath);
		String oldContent = "";
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while(line != null) {
				oldContent += line + System.lineSeparator();
				line = bufferedReader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			fileWriter = new FileWriter(file);
			fileWriter.write(newContent);
		} catch(IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

	public static void main(String[] args) {
		UpdateFile updateFile = new UpdateFile();
		updateFile.modify("D:\\LVC Simplilearn\\Folder1\\test5.txt", "2020", "2021");
		//updateFile.modifyUsingFile("D:\\LVC Simplilearn\\Folder1\\test5.txt", "2020", "2021");

	}

}
