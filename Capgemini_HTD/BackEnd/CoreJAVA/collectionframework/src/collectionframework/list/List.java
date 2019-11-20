package collectionframework.list;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();   //we need to import the java.util package to access the arraylist
		al.add(24);                     //here arrayList becomes as heterogeneous 
		al.add("Aishu");
		al.add(5.55);
		al.add('S');
		
		for(int i=0; i<4;i++) {
			Object r =al.get(i);   //get method to access the variables
			System.out.println(r);
			
		}
		
	}

}
