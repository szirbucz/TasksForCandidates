package com.kodekonveyor.second;

public class Square extends Rectangle {

	public Square(final int width) {
		super(width, width);
	}
	
	@Override
	public void setWidth(int widht) {
		this.setWidth(widht);
		this.setHeight(widht);
	}
	
	@Override
	public void setHeight(int height) {
		this.setWidth(height);
		this.setHeight(height);
	}
}
