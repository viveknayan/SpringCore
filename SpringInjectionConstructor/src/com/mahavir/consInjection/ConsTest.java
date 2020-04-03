package com.mahavir.consInjection;

public class ConsTest {
	
private String name,add;
private int age;

public ConsTest(String name,int age,String Add) {
	super();
	this.name = name;
	this.age=age;
	this.add=Add;
}

public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getAdd()
{
	return add;
}


}
