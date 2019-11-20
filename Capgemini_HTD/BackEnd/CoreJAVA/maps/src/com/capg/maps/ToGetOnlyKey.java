package com.capg.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ToGetOnlyKey {

	public static void main(String[] args) {

		
LinkedHashMap<String,Integer> hm = new LinkedHashMap<String , Integer>();    //hashmap does get order otput
		
		hm.put("Ondhu",1);
		hm.put("Idhu",5);
		hm.put("Hathu",10);
		hm.put("Erudu",2);
		
			System.out.println("****************Keys**********************");
			Set<String> s= hm.keySet();
			for (String r :s){
				System.out.println(r);
			}
			System.out.println("***********Values****************************");
			Collection <Integer> col = hm.values ();
			for (Integer r : col) {
				System.out.println(r);
			}
		}
			
	}


