package com.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapWaysItr {
	
	public static HashMap<Integer,String> m1=new HashMap<Integer,String>();
	
	public static void main(String args[])
	{
		 m1.put(1, "one");
		 m1.put(2, "two");
		 m1.put(3, "three");
		 m1.put(4, "four");
		 m1.put(5, "five");
		 m1.put(6, "six");
		 m1.put(7, "seven");
//		//11111111111Iterator Keyset
//		System.out.println("---Iterator keyset----");
//		Iterator itr=m1.keySet().iterator();
//		while(itr.hasNext())
//		{
//			
//			System.out.println(itr.next());
//			
//		}
//		System.out.println("---************----");
		 
		//2222222222Iterator Entryset
//		Iterator<Map.Entry<Integer, String>> itr=m1.entrySet().iterator();
//		System.out.println("---Iterator1 keyset----");
//		while(itr.hasNext())
//		{
//			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr
//					 .next();
//					 System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());
//			
//		}
//		System.out.println("---************----");
	 //3333333333333for each in keyset
//		for(Integer s : m1.keySet())
//		{
//			System.out.println(s+"---"+m1.get(s));
//		}
		 

		 //44444forEach and Lambda
//		 m1.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		 //55555 entry set stream API
//		 m1.entrySet().stream().forEach(e -> System.out.println("Key : " + e.getKey() + " Value : " + e.getValue()));

		 //6666 Stream API Parallel
		 m1.entrySet().stream().parallel().forEach(e -> System.out.println("Key : " + e.getKey() + " Value : " + e.getValue())); 

	}
	
}
