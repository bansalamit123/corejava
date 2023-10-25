package in.com.practise;

public class CharCount {
	public static void main(String[] args) {
		//Count char by char
		String name="malyalam";
		for(int i=0;i<name.length();i++) {
			char currentCh=name.charAt(i);
			int count=0;
			
			for(int j=0;j<name.length();j++) {
			if(name.charAt(j)==currentCh) {
				count++;
				
			}
			}
			System.out.println(""+currentCh+" "+count+" times");
		}
		
		
	}

}
