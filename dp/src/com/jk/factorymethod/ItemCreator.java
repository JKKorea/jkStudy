package com.jk.factorymethod;

public abstract class ItemCreator {

	// 템플릿 메서드
	public Item create() {
		Item item;

		// 정보가져오고
		requestItemsInfo();

		// 생성
		item = createItem();

		// log
		createItemLog();

		return item;
	}

	abstract protected void requestItemsInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
}
