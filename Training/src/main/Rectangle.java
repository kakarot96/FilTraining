package main;

public class Rectangle extends Figure{
	
	private double length,width;
	
	public Rectangle(double length, double width) {
		// TODO Auto-generated constructor stub
			setLength(length);
			setWidth(width);

	}

	public double area(){
	return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
