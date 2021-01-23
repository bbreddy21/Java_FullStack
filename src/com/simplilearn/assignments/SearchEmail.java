package com.simplilearn.assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchEmail {

	public static boolean isValidFormat(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		return pat.matcher(email).matches();
	}

	public static void main(String args[]) {

		String[] emailIds = { "ravi@gmail.com", "raj@gmail.com", "mohan@yahoo.com", "ramesh@aol.com" };
		boolean emailfound = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the Email to Search");
			String input = scanner.next();
			if (input.equalsIgnoreCase("exit"))
				System.exit(0);
			if (SearchEmail.isValidFormat(input)) {
				for (String email : emailIds) {
					if (email.equalsIgnoreCase(input)) {
						emailfound = true;
						break;
					}
				}

				if (emailfound)
					System.out.println("Email id is present");
				else
					System.out.println("Email id is not present");

			} else
				System.out.println("Enter Valid Email Format");

		}

	}

}