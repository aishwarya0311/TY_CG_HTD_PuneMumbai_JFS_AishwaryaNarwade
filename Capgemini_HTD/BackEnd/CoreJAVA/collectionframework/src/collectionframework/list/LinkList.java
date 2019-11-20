package collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {

		LinkedList li= new LinkedList();
		li.add(9);
		li.add("Dimple");
		li.add(5.55);
		
		
		System.out.println("For loop");
		for (int i =0; i<3;i++)
		{
			Object r=li.get(i);
			System.out.println(r);
			}
		
		System.out.println("-----------------for each---------------");
		for(Object r: li) {
			System.out.println(r);
		}
		System.out.println("--------------------Iterator------------------");
		Iterator it = li.iterator();   
		while (it.hasNext()) {         
			Object r = it.next();
			System.out.println(r);
	}
		System.out.println("----------------------ListIterator----------------");
		{
			ListIterator lit= li.listIterator();
			System.out.println("------------------------>forward");
			while(lit.hasNext()) {
				Object r = lit.next();
				System.out.println(r);
			}
			System.out.println("<-----------------Backward");
			while(lit.hasPrevious()) {
				Object r = lit.previous();
				System.out.println(r);
			}
			
			
		}

	}
}
