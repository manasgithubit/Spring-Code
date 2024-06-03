package com.nt.comp;

public class Test01 {

	private int a = 10;
	private String b = "hello";
	
	public Test01() {
		// TODO Auto-generated constructor stub
		System.out.println("Test01::0-param constructor");
	}
	public Test01(int a, String b) 
	{
		System.out.println("Test01:: 2-param constructor");
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Test01[a = "+a+", b = "+b+"]";
	}
}
