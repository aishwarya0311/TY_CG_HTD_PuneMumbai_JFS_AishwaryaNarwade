package collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestE {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		al.add('S');
		al.add('E');
		al.add('A');
		al.add('W');
		Collections.sort(al);
		System.out.println(al);
	}

}
