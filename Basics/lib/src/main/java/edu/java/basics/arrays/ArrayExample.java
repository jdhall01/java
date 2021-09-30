package edu.java.basics.arrays;

import java.io.PrintStream;

//import static java.lang.System.out;

public class ArrayExample {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use PrintStream instead of //import static java.lang.System.out;
		//https://stackoverflow.com/questions/2504078/java-out-println-how-is-this-possible
		//conveniently print
		//PrintStream out = System.out;
		//Another way for this convenience is to have a local wrapper like
		// protected void println(Object o)

		//create an array of integers and initialize it, in single step
		int[] arrInt = {0, 1, 2, 3, 4};
		
		//create an array of integers and initialize it, in two step
		int[] arrInt2;
		//arrInt2 = {6, 7, 8, 9, 10}; //ERROR: Array constants can only be used in initializers
				
		//print the length of the array
		println("length of arrInt is " + arrInt.length);
		//out.println("length of arrInt2 is " + arrInt2.length); //ERROR: The local variable arrInt2 may not have been initialized
		
		//print an element of the array
		println("the last element of arrInt is " + arrInt[arrInt.length-1]);
		//println(arrInt);//INCORRECT: prints [I@52feb982. use the Arrays class
		
		//create an array of strings and initialize it
		String[] arrStrings = {"Java", "C#", "Python"};
		println(arrStrings[0] + ", The Complete Reference - Herbert Schildt");
		
		//update an element of the string array
		arrStrings[1] = "Go";
		println(arrStrings[1] + " is gaining popularity!");
	}

}
