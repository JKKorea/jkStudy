package com.jk.abstractfactory;

import com.jk.abstractfactory.abst.BikeFactory;
import com.jk.abstractfactory.abst.Body;
import com.jk.abstractfactory.abst.Wheel;
import com.jk.abstractfactory.gt.GtBikeFactory;
import com.jk.abstractfactory.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
//        BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

    }
}
