package AbstractFactory;

import Factory.Shape;
import Singleton.Singleton;

public class PatternCollector {
	public static void main(String args[]){

		// Singleton example usage

		//Singleton newInstance = new Singleton();
		//newInstance.getInstance();
		//newInstance.getInstance();

		//Singleton getNewOne = new Singleton();
		//getNewOne.getInstance();
		//getNewOne.getInstance();

		// Singleton more practical usage with Scanner class

		Singleton wannaBeMyFriend = new Singleton();
		wannaBeMyFriend.getScanner();
		Singleton anotherFriend = new Singleton();
		anotherFriend.getScanner();

		// Factory example usage

//		ShapeFactory createShape = new ShapeFactory();
//		Shape shape1 = createShape.getShape("square");
//		shape1.draw();

		// Abstract Factory simple usage

		// First we need to create an which Factory want we use
		// AbstractFactory ourFactory = FactoryProducer.getFactory("color");
		//Shape shape2 = ourFactory.getShape("rectangle");
		// Color color2 = ourFactory.getColor("red");
		//shape2.draw();
		// color2.fill();
	}
}
