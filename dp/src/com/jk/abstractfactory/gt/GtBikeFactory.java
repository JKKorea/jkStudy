package com.jk.abstractfactory.gt;

import com.jk.abstractfactory.abst.BikeFactory;
import com.jk.abstractfactory.abst.Body;
import com.jk.abstractfactory.abst.Wheel;

public class GtBikeFactory implements BikeFactory {
	@Override public Body createBody() {
		return new GtBody();
	}

	@Override public Wheel createWheel() {
		return new GtWheel();
	}
}
