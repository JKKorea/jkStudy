package com.jk.factorymethod;

public class NewPotion implements Item {

	@Override public void use() {
		System.out.println("새로운 회복!");
	}
}
