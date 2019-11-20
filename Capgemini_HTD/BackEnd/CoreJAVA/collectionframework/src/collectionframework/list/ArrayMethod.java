package collectionframework.list;

import java.util.ArrayList;

public class ArrayMethod {

	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();  //generic array list

		al.add(7.8);
		al.add(8.5);
		al.add(4.66);
		al.add(2.2);
		
		ArrayList<Double> bl= new ArrayList<Double>();  //generic array list

		bl.add(8.2);
		bl.add(8.5);
		System.out.println( al.addAll(bl));
		
		
	}
}
