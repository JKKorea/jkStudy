package com.jk.factorymethod;

public class Main {

	public static void main(String[] args) {
		process(new HpCreator());
		process(new MpCreator());
		process(new NewCreator());
	}

	public static void process(ItemCreator itemCreator) {
		Item item = itemCreator.create();
		item.use();
	}
}

