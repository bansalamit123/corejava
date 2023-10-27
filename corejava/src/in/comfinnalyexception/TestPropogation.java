package in.comfinnalyexception;

public class TestPropogation {
	public static void main(String[] args) {
		m1();
		}
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		try {
		String name="Amit";
		System.out.println(name.charAt(7));
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
