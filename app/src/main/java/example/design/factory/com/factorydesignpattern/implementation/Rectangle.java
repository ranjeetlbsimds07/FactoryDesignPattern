package example.design.factory.com.factorydesignpattern.implementation;

import example.design.factory.com.factorydesignpattern.abstracts.Shape;

/**
 * Created by Guest User on 10/16/2017.
 */

public class Rectangle  implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
