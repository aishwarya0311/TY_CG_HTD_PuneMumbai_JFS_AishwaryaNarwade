package collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class List3 {

	public static void main(String[] args) {
ArrayList al= new ArrayList();
		
		al.add("WELCOME");
		al.add(45);
		al.add('R');
		al.add(78.45);
		
		ListIterator r = al.listIterator(); //creating list iterator 
		
		System.out.println("---------------->FORWARD");
		while(r.hasNext())      
		{
			Object o = r.next();
			System.out.println(o);
			}
		System.out.println("<------------BACKWARD");
		while(r.hasPrevious()) {
			Object o =r.previous();
			System.out.println(o);
		}
		
	}

}
