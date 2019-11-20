package collectionframework.list;

import java.util.ArrayList;

public class DoubleAdd {
	public static void main(String[] args) {

		ArrayList<Double> al= new ArrayList<Double>();  //generic array list

		al.add(7.8);
		al.add(8.5);
		al.add(4.66);
		al.add(2.2);
		System.out.println("before------>"+al);
		al.add(4.2);               //add method adds the value to last place
		al.add(2,7.33);            //add method adds to the value index given
		System.out.println("after--------->"+al);
	}
	
}
