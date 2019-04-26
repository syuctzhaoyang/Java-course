package com;

public class RectApp {

	public RectApp() {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		
		System.out.println(rectangle1.pi);
		System.out.println(rectangle2.pi);
		rectangle1.pi = 2.71828d;
		System.out.println();
		System.out.println(Rectangle.pi);

	}

	public static void main(String[] args) {
		new RectApp();
	}

}
