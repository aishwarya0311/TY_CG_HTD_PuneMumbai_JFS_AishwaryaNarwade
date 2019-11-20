package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List5 {

	public static void main(String[] args) {
ArrayList<Double> al= new ArrayList<Double>();  //generic array list
		
		al.add(7.8);
		al.add(8.5);
		al.add(4.66);
		al.add(2.2);
		
		Iterator <Double> it = al.iterator();
		while(it.hasNext()) {
			Double r = it.next();
			System.out.println(r);
		}
		
	}

}
