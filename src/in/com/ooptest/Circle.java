package in.com.ooptest;

public class Circle {
	 private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	 public void cArea() {
		 double a=3.14*radius*radius;
		 System.out.println("Circle area is:"+a);
	 }
	

}
class Triangle extends Circle{
	int base,height;

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
		int d=(base*height)/2;
		System.out.println("Triangle Area is:"+d);
	}
}
