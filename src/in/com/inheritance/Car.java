package in.com.inheritance;

public class Car extends Vehical{
	int wheel=4;
	String colour="Black";
	


class bycicle extends Vehical{
	int wheel=2;
	
}
public static void main(String[] args) {
	Car c=new Car();
	c.go();
	c.stop();
	System.out.println(c.wheel);
	System.out.println(c.colour);
	System.out.println(c.speed);
} 
}