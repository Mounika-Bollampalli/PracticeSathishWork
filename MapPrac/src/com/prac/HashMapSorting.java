package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {

	static Map m=new HashMap();
	public static void main(String[] args) {
	
		m.put(36,"dfgh");
		m.put(43, "asf");
		m.put(13,"dfgh");
		m.put(14, "asf");
		m.put(53,"dfgh");
		m.put(41, "asf");
		  TreeMap<Integer, String> sorted = new TreeMap<Integer, String>(m);
		System.out.println(sorted.keySet());
		
		
	}

}
