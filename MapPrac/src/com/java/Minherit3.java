package com.java;

public class Minherit3 extends Minherit1 implements InhertInterface{

	public static void main()
	{
		Minherit3 m2=new Minherit3();
		m2.call();
		System.out.println(m2);
		System.out.println(InhertInterface.www);
	}
}
