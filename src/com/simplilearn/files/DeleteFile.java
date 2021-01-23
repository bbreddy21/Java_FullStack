package com.simplilearn.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	private static void delete(String filePath) {
		Path path = Paths.get(filePath);
		try {
			Files.delete(path);
		} catch (NoSuchFileException exce) {
			System.out.println("There is no file!!");
			exce.printStackTrace();
		} catch (DirectoryNotEmptyException directoryNotEmptyException) {
			directoryNotEmptyException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		delete("D:\\LVC Simplilearn\\Folder1\\New folder");
		System.out.println("File deleted!");

	}

}
