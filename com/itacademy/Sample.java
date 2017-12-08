package com.itacademy;

public class Sample {

	private int i;

	{
		System.out.println("block1:" + i);
	}

	public Sample(int i) {
		super();
		this.i = i;
		System.out.println("constructor:" + i);
	}

	{
		System.out.println("block2:" + i);
	}

}
