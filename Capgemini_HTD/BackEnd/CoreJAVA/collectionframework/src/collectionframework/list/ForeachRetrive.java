package collectionframework.list;

import java.util.ArrayList;

public class ForeachRetrive {

	public static void main(String[] args) {

		
		ArrayList al= new ArrayList();
		al.add("Raju");
		al.add(19);
		al.add('M');
		al.add(6.14);
		
		for(Object r:al) {
			System.out.println(r);
		}
	}

}
