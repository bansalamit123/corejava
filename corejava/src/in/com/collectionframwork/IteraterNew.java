package in.com.collectionframwork;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;
public class IteraterNew {
	int id;
	String name;
	String address;
	public IteraterNew(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public String toString() {
		return id+" "+name+" "+address;
	}
	public static void main(String[] args) {
		IteraterNew i=new IteraterNew (1,"Amit","Gwalior");
		IteraterNew i1=new IteraterNew(2,"Anil","Sheopur");
		ArrayList l=new ArrayList();
		l.add(i);
		l.add(i1);
		/* IteraterNew t=(IteraterNew)l.get(0);
		System.out.println(t);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.address);*/
		
		
		
		/*for(int j=0;j<l.size();j++) {
			IteraterNew ti=(IteraterNew)l.get(j);
			System.out.println(ti);
			
		}*/
		
		/*for(Object o:l) {
			IteraterNew itt =(IteraterNew)o;
			System.out.println(itt);
			
		}*/
		Iterator it= l.iterator();
		while(it.hasNext()) {
			IteraterNew tii=(IteraterNew) it.next();;
			System.out.println(tii);
			
		}
		
		
		
		
		
	}
	

}
