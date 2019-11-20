package collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestD {

	public static void main(String[] args) {
LinkedList<Double> li = new LinkedList<Double> ();

li.add(1.2);
li.add(5.55);
li.add(4.33);
li.add(3.32);

System.out.println("Before----->"+li);
Collections.shuffle(li);                  //sorts in ascending order
System.out.println("After------>"+li);

	}

}
