package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRetrive {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		
		al.add("Priya");
		al.add(2);
		al.add('F');
		al.add(5.6);
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
					
		}
	}

}
