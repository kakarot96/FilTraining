package main;

public class Circle extends Figure{
	private double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		setRadius(radius);
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
