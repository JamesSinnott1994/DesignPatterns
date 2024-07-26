import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.FactoryProducer;
import AbstractFactoryPattern.Shape;

//import FactoryPattern.Shape;
//import FactoryPattern.ShapeFactory;

import SingletonPattern.SingleObject;

public class Main {

    public static void main(String[] args) {
        abstractFactoryPatternDemo();
    }

//    public static void factoryPatternDemo() {
//
//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        // Get an object of Circle and call it's draw method.
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//
//        // Call draw method of Circle
//        shape1.draw();
//
//        // Get an object of Rectangle and call its draw method.
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//
//        // Call draw method of Rectangle
//        shape2.draw();
//
//        // Get an object of Square and call its draw method.
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//
//        // Call draw method of square
//        shape3.draw();
//
//    }

    public static void singletonPatternDemo() {
        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // Show the message
        object.showMessage();

    }

    public static void abstractFactoryPatternDemo() {

        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // Get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        // Call draw method of Shape Rectangle
        shape1.draw();

        // Get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");

        // Call draw method of Shape Square
        shape2.draw();

        // Get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        // Get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");

        // Call draw method of Shape Rectangle
        shape3.draw();

        // Get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");

        // Call draw method of Shape Square
        shape4.draw();


    }

}
