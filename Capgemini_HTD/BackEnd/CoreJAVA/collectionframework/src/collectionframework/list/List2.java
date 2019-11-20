package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List2 {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		
		al.add("WELCOME");
		al.add(45);
		al.add('R');
		al.add(78.45);
		
		Iterator it = al.iterator();   //to get the iterator object
		while (it.hasNext()) {         //hasNext method checks in next position index is present or not, if there is object it gives true result
			Object r = it.next();
			System.out.println(r);
		}
		
	}

}
