package collectionframework.list;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		al.add(55);
		al.add('A');
		al.add("Hello");
		al.add(8.567);
		
		for (Object r :al) {
			System.out.println(r);
		}
	}

}
