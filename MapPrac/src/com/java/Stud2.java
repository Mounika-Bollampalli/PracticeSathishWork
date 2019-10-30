package com.java;

public class Stud2 extends Stud1{
	
	public void stud(String s)
	{
		System.out.println(s+"---stud2");
	}

	public static void main(String args[])
	{
		Stud2 s=new Stud2();
		s.stud("Mounika");
		Stud1 s1=new Stud1();
		s1.stud("Mounika1");
		Stud1 s2=new Stud2();
		s2.stud("Mounika2");
		
		
	}
}
