package edu.java.basics.oop.justice;

public class CopDerived extends Cop {
	
	//can access package private from derived class within the same package
	public void accessBasePackagePrivate () {
		super.gun2 = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopDerived copDerived = new CopDerived();
		copDerived.accessBasePackagePrivate();
	}

}
