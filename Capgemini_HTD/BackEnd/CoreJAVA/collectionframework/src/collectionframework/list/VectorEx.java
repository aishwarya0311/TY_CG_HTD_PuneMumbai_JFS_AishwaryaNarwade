package collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector <Integer> v= new Vector<Integer>();

		v.add(7);
		v.add(8);
		v.add(4);
		v.add(2);
		
		for(int i =0; i<4;i++) {              //for loop
			Integer r =v.get(i);               //using double type instead of object 
			System.out.println(r);
		}
		System.out.println("*************************");
		for (Integer r:v){
			System.out.println(r);
			
		}
		System.out.println("--------------------Iterator------------------");
		Iterator it = v.iterator();   
		while (it.hasNext()) {         
			Object o = it.next();
			System.out.println(o);
	}
		System.out.println("----------------------ListIterator----------------");
		{
			ListIterator lit= v.listIterator();
			System.out.println("------------------------>forward");
			while(lit.hasNext()) {
				Object w = lit.next();
				System.out.println(w);
			}
			System.out.println("<-----------------Backward");
			while(lit.hasPrevious()) {
				Object p = lit.previous();
				System.out.println(p);
		{
			
		}
			}
		}
	}
}


