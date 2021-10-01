package edu.java.basics.oop.interfaces;

public interface CanFly {
	void fly();
	default String getName() {
		return this.getClass().getSimpleName();
	}
}
