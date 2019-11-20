package collectionframework.list;

import java.util.LinkedList;

public class TypeString {

	public static void main(String[] args) {
LinkedList<String> a= new LinkedList();

a.add("abcd");
a.add("pqrs");
for (String r:a) {
	System.out.println(r);
	}
System.out.println("-------------------------------------------");
for(int i=0; i<2; i++) {
	String k=a.get(i);
	System.out.println(k);
	
}
	}
	}
