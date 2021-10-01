package edu.java.basics.oop.overriding;

public class Rectangle extends Shape {
	
	private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public String toString2() {
		return "Rectangle";
	}
}
