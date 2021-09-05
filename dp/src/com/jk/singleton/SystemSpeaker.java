package com.jk.singleton;


public class SystemSpeaker {

	private static SystemSpeaker systemSpeaker;

	private SystemSpeaker() {};

	public static SystemSpeaker getInstance() {
		if (systemSpeaker == null) {
			systemSpeaker = new SystemSpeaker();
		}
		return systemSpeaker;
	}
}
