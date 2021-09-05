package com.jk.factorymethod;

import java.util.Date;

public class NewCreator extends ItemCreator {

	@Override protected void requestItemsInfo() {
		System.out.println("db에서 새로운 물약 의 정보를 가져옵니다.");
	}

	@Override protected void createItemLog() {
		System.out.println("새로운 물약을 새로 생성했습니다." + new Date());
	}

	@Override protected Item createItem() {
		return new NewPotion();
	}
}
