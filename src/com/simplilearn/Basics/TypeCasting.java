package com.simplilearn.Basics;
public class TypeCasting {

	public static void main(String[] args) {
		char c = 66;

		System.out.println("Implicit type casting");

		short s = (short) c;
		int i = c;
		long l = c;
		float f = c;
		double d = i;
		System.out.println("Value of s : " + s);
		System.out.println("Value of i : " + i);
		System.out.println("Value of l : " + l);
		System.out.println("Value of f : " + f);
		System.out.println("Value of d : " + d);

		System.out.println("****Explicit type casting*****");

		double d1 = 51983.86;
		int i2 = (int) d1;
		float f2 = (float) d1;
		long l2 = (long) d1;
		short s1 = (short) d1;

		System.out.println("Value of i2 : " + i2);
		System.out.println("Value of f2 : " + f2);
		System.out.println("Value of l2 : " + l2);
		System.out.println("Value of s1 : " + s1);

		String s5 = "10";

		int i5 = Integer.parseInt(s5);
		System.out.println(i5);
	}

}
