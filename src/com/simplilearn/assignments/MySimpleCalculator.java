package com.simplilearn.assignments;

import java.util.Scanner;

public class MySimpleCalculator {

	// Declare the User input Numbers
	private static int Num1; // Declare static variable
	private int Num2;
	public static int choice;

	public int getNum1() {
		return Num1;
	}

	private void setNum1(int num1) {
		MySimpleCalculator.Num1 = num1;
	}

	public int getNum2() {
		return Num2;
	}

	private void setNum2(int num2) {
		this.Num2 = num2;
	}

	public int addNumbers(int a, int b) {

		return a + b;

	}

	// Should not be allowed to override
	public final int subNumbers(int a, int b) {

		return a - b;

	}

	public int mulNumbers(int a, int b) {

		return a * b;

	}

	public int divNumbers(int a, int b) {

		return (int) (a / (double) b);

	}

	public static void main(String[] args) {

		MySimpleCalculator calc = new MySimpleCalculator();
		Scanner input = new Scanner(System.in);
		System.out.println("/n**********Simple Calculator*******");
		do {

			// Get user Input
			System.out.println("\nEnter first Number");

			calc.setNum1(input.nextInt());
			System.out.println("\nEnter second Number");
			calc.setNum2(input.nextInt());
			// Give user options
			System.out.println("\nHere are your Calculator options:");
			System.out.println("\n1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplicaton");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("\nWhat would you like to do?: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				int sum = calc.addNumbers(calc.getNum1(), calc.getNum2());
				System.out.println("Addition of Given Numbers :" + sum);
				break;
			case 2:
				int diff = calc.subNumbers(calc.getNum1(), calc.getNum2());
				System.out.println("Substraction of Given Numbers :" + diff);
				break;
			case 3:
				double multival = calc.mulNumbers(calc.getNum1(), calc.getNum2());
				System.out.println("Multiplication of Given Numbers :" + multival);
				break;
			case 4:
				double div = calc.divNumbers(calc.getNum1(), calc.getNum2());
				System.out.println("Division of Given Numbers :" + div);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
				break;
			}
		} while (choice != 5);
		// close the scanner object
		input.close();

	}

}
