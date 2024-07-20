package FactoryPattern;

public class Rectangle implements Shape {

    // Example of dynamic/runtime polymorphism
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
