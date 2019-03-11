package com.synechron.training.inheritence;

public abstract class Geometry {

	public abstract void draw();
	
	public void printinfo()
	{
		System.out.println("i'm a Geometry Class..");

	}
	
	public final void superClassInfo()
	{
		System.out.println("Geometry is the superclass");
	}
}
