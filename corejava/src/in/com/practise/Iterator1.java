package in.com.practise;

import java.util.ArrayList;

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

public class Iterator1 {
	int id;
	String name,address;
	 public Iterator1(int id,String name,String address) {
		 this.id=id;
		 this.name=name;
		 this.address=address;
		 
		  }
	 public String toString() {
	 return id+" "+name+" "+address;
		 
	 }
	 
	 public static void main(String[] args) {
		 Iterator1 it=new Iterator1(1,"Amit","vijaypur");
		 Iterator1 it2=new Iterator1(2,"anil","morena");
		 ArrayList ar=new ArrayList();
		 ar.add(it);
		 ar.add(it2);
		/* Iterator1 t=(Iterator1)ar.get(0);
		 System.out.println(t);
		 System.out.println(t.id);
		 System.out.println(t.name);
		 System.out.println(t.address);*/
		 
		 for(int i=0;i<ar.size();i++) {
			 Iterator1 itt=( Iterator1)ar.get(i);
			 System.out.println(itt);
			 
			 
		 }
		 for(Object o:ar) {
			 System.out.println(o);
		 
		 }
	 Iterator ti=ar.iterator();
     while(ti.hasNext()) {
   	  System.out.println(ti.next());
     }

}
}
