package com.kodekonveyor.third;

import java.util.List;

public class Circle implements Shape, Comparable<Circle>{
	
	private double radius;
	
	public Circle(final double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public List<Double> getSides() {
		// Sides are not applicable for circle.
		throw new UnsupportedOperationException();
	}

	@Override
	public int compareTo(Circle o) {
		return ((Double) this.calculateArea()).compareTo(o.calculateArea());
	}

	public double getRadius() {
		return radius;
	}
	
	
}
