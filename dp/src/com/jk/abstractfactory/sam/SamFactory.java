package com.jk.abstractfactory.sam;


import com.jk.abstractfactory.abst.BikeFactory;
import com.jk.abstractfactory.abst.Body;
import com.jk.abstractfactory.abst.Wheel;

public class SamFactory implements BikeFactory {
	@Override public Body createBody() {
		return new SamBody();
	}

	@Override public Wheel createWheel() {
		return new SamWheel();
	}
}
