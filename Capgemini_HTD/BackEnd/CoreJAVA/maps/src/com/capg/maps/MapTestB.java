package com.capg.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTestB {

	public static void main(String[] args) {

		
		
LinkedHashMap<String,Integer> hm = new LinkedHashMap<String , Integer>();//LinkedHashMap does give order otput
		
		hm.put("Ondhu",1);
		hm.put("Idhu",5);
		hm.put("Hathu",10);
		hm.put("Erudu",2);
		
		for (Map.Entry<String, Integer> r: hm.entrySet() )
		{
			String k= r.getKey();
			Integer v= r.getValue();
			System.out.println("Key is :"+k);
			System.out.println("Value is :"+v);
			System.out.println("**************************************");
			
		}
			
	}

}
