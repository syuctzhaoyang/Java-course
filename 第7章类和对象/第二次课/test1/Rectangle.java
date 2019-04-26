package com;

public class Rectangle {
	private double width,height;
	public static double pi = 3.14d;
	public Rectangle() {
		this(3,2);
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double area(){
		return width * height;
	}
	public double girth(){
		return (width + height) * 2;
	}
}
