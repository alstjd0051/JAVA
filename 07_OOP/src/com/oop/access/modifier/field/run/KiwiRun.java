package com.oop.access.modifier.field.run;

import com.oop.access.modifier.field.Kiwi;

public class KiwiRun extends Kiwi{

	public static void main(String[] args) {
			
		Kiwi kw = new Kiwi();
		System.out.println(kw.publicNum);
//		System.out.println(kw.protectedNum); //자식클래스인 경우 ok
//		System.out.println(kw.defaulNum);
//		System.out.println(kw.privateNum);
		}
	}
