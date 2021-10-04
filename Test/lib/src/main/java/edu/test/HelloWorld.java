package edu.test;

public class HelloWorld {
	
	protected static void println(Object o) {
		System.out.println(o);
	}
	
	int val;
	
	

	public int getVal() {
		return val;
	}



	public void setVal(int val) {
		this.val = val;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		println("Hello World!");
	}

}
