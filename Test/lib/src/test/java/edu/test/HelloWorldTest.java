package edu.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetVal() {
		HelloWorld hw = new HelloWorld();
		hw.setVal(2);
		assertTrue(hw.getVal() == 2);
	}

}
