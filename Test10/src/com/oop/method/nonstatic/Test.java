package com.oop.method.nonstatic;

public class Test {

	public static void main(String[] args) {

		NonStaticSample s= new NonStaticSample();
		
		
		s.printLottoNumbers();
		System.out.println();
		
		s.outPutChar(5, 'A');
		System.out.println();
		
		System.out.println("랜덤알파벳 : " +s.alphabet());
		System.out.println();
		
		System.out.println(s.mySubString("송민성",0,2));
	}

}
