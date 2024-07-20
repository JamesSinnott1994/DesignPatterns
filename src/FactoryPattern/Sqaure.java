package FactoryPattern;

public class Sqaure implements Shape {

    // Example of dynamic/runtime polymorphism
    @Override
    public void draw() {
        System.out.println("Inside Sqaure::draw() method.");
    }

}
