package in.com.inheritance;

public class TestShap {
	public static void main(String[] args) {
//		Shape[]s=new Shape[4];
//		s[1]=new Circle();
//		s[0]=new Triangle();
//		s[2]=new Squre();
//		Circle c = (Circle) s[1];
//		c.setRadius(5);
//		Triangle t=new Triangle();
//		t.setBase(5);
//		t.setHeight(6);
//		t.tArea();
		Circle c=new Circle();
		c.setRadius(5);
		System.out.println("Triangle Area: "+c.cArea());
		
	}

}
