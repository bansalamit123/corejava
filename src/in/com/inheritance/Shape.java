package in.com.inheritance;

public class Shape {
	int borderwidth;
	String colour;
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	}
class Triangle extends Shape{
	int base;
	int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void tArea() {
		double xx =( base*height)/2;
		System.out.println("Area"+xx);
	}
	
}
class Circle extends Shape{
	int radius;
	double pi=3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double cArea() {
		 return pi*radius*radius;
	}
		
	
}
class Squre extends Shape{
	int length,bidth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBidth() {
		return bidth;
	}

	public void setBidth(int bidth) {
		this.bidth = bidth;
	}
	public double sqArea() {
		return length*bidth;
	}
	
}

