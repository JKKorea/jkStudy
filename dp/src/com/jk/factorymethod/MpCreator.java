package com.jk.factorymethod;

import java.util.Date;

public class MpCreator extends ItemCreator {

	@Override protected void requestItemsInfo() {
		System.out.println("db에서 마력 회복 물약 의 정보를 가져옵니다.");
	}

	@Override protected void createItemLog() {
		System.out.println("마력 회복 물약을 새로 생성했습니다." + new Date());
	}

	@Override protected Item createItem() {
		return new MpPotion();
	}
}
