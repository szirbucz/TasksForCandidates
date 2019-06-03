package com.kodekonveyor.third;

import java.util.List;

public class Rectangle implements Shape, Comparable<Rectangle> {
	
	private double width;
	private double height;
	
	public Rectangle(final double width, final double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

	@Override
	public List<Double> getSides() {
		return List.of(width, height, width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		return ((Double) this.calculateArea()).compareTo(o.calculateArea());
	}

}
