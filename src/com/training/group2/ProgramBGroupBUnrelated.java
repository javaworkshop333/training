package com.training.group2;

import com.training.group1.ProgramA;

public class ProgramBGroupBUnrelated {
	public void test() {
		ProgramA prA=new ProgramA();
		System.out.println( prA.a );
		System.out.println( prA.b);
		System.out.println( prA.c );
		System.out.println( prA.d );
		prA.method1();
	}
}
