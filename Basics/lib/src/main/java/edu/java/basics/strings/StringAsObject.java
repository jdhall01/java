package edu.java.basics.strings;

public class StringAsObject {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of String and assign it to a reference
		String strBookTitle = "Microservices Patterns";
		println("Title:" + strBookTitle);
		
		//create a reference of type String
		String strBookAuthor;
		//create an object of String and assign it to a reference
		strBookAuthor = "Chris Richardson";
		println("Author: " + strBookAuthor);
		
		//call some instance methods
		
		println("(CAPS) Title: " + strBookTitle.toUpperCase());
		println("Title Length is " + strBookTitle.length());
		println("Author name begins with " + strBookAuthor.substring(0, 4));
		println("Lot of 'S' in the title: " + strBookTitle.toLowerCase().replace('s', 'S'));
		byte[] byteArr = strBookTitle.getBytes();
		//println("Title as Byte Array: " + byteArr.toString());//INCORRECT: prints [B@7a765367
		byteArr[0] = 'N';
		println("Byte array of title modified in-place. First byte is " + byteArr[0] + ". Integer value of 'N' is 78.");
		println("In the title, the value of first char is unchanged, and is " + strBookTitle.charAt(0));
	
		//length() method on a string literal
		println("Length of 'String Literal' is " + "String Literal".length());
	}

}
