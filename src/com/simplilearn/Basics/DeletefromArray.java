package com.simplilearn.Basics;

import java.util.Scanner;

public class DeletefromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, x, flag = 1, loc = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array Size");
		n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array Elements");
		for (int i = 0; i < n; i++) {

			a[i] = input.nextInt();
		}

		System.out.println("enter the element to delete");
		x = input.nextInt();
		for (int i = 0; i < n; i++) {

			if (a[i] == x) {

				flag = 1;
				loc = i;
				break;
			} else {

				flag = 0;
			}
		}
		if (flag == 1) {

			for (int i = loc + 1; i < n; i++) {

				a[i - 1] = a[i];
			}

			System.out.println("After Deleting");

			for (int i = 0; i < n; i++) {
				System.out.println(a[i] + ",");
			}
			System.out.println(a[n - 2]);

		} else {
			System.out.println("element not found");
		}
	}
}
