package com.synechron.training.accessdemo.pack2;

import com.synechron.training.accessdemo.pack1.AccessDemo1;

public class AccessDemo3 extends AccessDemo1 
{

	public static void main(String[] args) {
		AccessDemo3 ad1 = new AccessDemo3();
		ad1.c=300;
		ad1.d=400;

		ad1.protectedMethod();
		ad1.publicMethod();

	}
}
