package com.simplilearn.Basics;

public class ArrayDemo {

	public char[] CreateArray() {

		/*
		 * char[] s; s = new char[26];
		 */
		char[] s = new char[26];
		for (int i = 0; i < 26; i++) {

			s[i] = (char) ('A' + i);
		}
		return s;

	}

	public static void main(String[] args) {
		
		ArrayDemo ad = new ArrayDemo();
		char[] a = ad.CreateArray();
		for(int i=0;i<26;i++) {
			
			System.out.println(a[i]);
		}
			
		

	}

}
