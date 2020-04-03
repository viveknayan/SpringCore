package com.mahavir.beanScope;

public class BeanScopeTest {
	
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public int fact()
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
	}
	public void initTest()
	{
		System.out.println("We Are in init method ");
	}
	public void destroyTest()
	{
		System.out.println("\nWe Are in destroy method ");
	}
	
	

}
