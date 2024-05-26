package com.zkf.abstractFactory.basicT1.define;

public interface AbstractFactory {
    LowClassUnit createLowClass();

    MidClassUnit createMidClass();

    HighClassUnit createHighClass();
}
