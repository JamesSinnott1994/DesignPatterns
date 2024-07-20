package FactoryPattern;

public class Circle implements Shape {

    // Example of dynamic/runtime polymorphism
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
