package in.com.abstract_;

public class AbstractTest {

	public static void main(String[] args) {
		Rectangle re=new Rectangle () {

			@Override
			public void total() {
				// TODO Auto-generated method stub
				System.out.println("Total is calling");
				
			}
			
		};
		re.area();
		re.total();
		Shape s=new Shape() {
			int i;
			String s;
			@Override
			public void area1(int a, String name) {
				// TODO Auto-generated method stub
				this.i=i;
				this.s=s;
				System.out.println("Main class Area method"+i+" "+s);
				
			}
			
		};
		
	}
}
