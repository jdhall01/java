package edu.java.basics.oop.crime;

import edu.java.basics.oop.justice.Cop;
import edu.java.basics.oop.justice.CopDerived;

public class ThiefImpersonatedAsCop extends Cop {

	//can NOT access package-private of base class
	//from outside the package of the base class
	public void accessBasePackagePrivate () {
		//super.gun2 = 5;//ERROR: not visible
	}
	
	//can access protected member of base class
	public void fire () {
		super.fire();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThiefImpersonatedAsCop copInpersonated = new ThiefImpersonatedAsCop();
		copInpersonated.accessBasePackagePrivate();
	}

}
