package in.com.practise;

public class CharCount {
	public static void main(String[] args) {
		//Count char by char
		String name="malyalam";
		int count=0;
		for(char ch='a';ch<'z';ch++) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==ch) {
				count++;
					
				}
			}
			if(count>0) {
				System.out.println(ch+"="+count);
			}
			count=0;
		}
		
		
	}

}
