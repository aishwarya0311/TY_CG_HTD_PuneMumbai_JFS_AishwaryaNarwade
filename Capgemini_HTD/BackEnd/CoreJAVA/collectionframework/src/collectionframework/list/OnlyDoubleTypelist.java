package collectionframework.list;

import java.util.ArrayList;

public class OnlyDoubleTypelist {

	public static void main(String[] args) {

		ArrayList<Double> al= new ArrayList<Double>();  //generic array list

		al.add(7.8);
		al.add(8.5);
		al.add(4.66);
		al.add(2.2);
		
		for(int i =0; i<4;i++) {              //for loop
			Double r =al.get(i);               //using double type instead of object 
			System.out.println(r);
		}
		
	}

}
