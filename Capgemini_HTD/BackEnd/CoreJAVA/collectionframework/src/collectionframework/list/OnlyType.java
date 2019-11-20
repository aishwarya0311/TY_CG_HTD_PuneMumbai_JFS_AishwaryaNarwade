package collectionframework.list;

import java.util.ArrayList;

public class OnlyType {

	public static void main(String[] args) {
ArrayList<Double> al= new ArrayList<Double>();  //generic array list
		
		al.add(7.8);
		al.add(8.5);
		al.add(4.66);
		al.add(2.2);
		
		for (Double r:al) {
			System.out.println(r);
		}
}

}
