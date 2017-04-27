package AbstractFactory;

import Factory.Circle;
import Factory.Rectangle;
import Factory.Shape;
import Factory.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType){

		if(shapeType == null) return null;
		else if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		else if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		return null;
	}

	@Override
	Color getColor(String color){
		return null;
	}
}

// Factory pattern is one of the most used design pattern in java.
// This type of design pattern comes under creational
// as this pattern provides one of the best ways to create an object.
// In Factory pattern we create object without exposing the creation logic
// to the client and refer to newly created object using common interface.
//
// Advantages of factory pattern:
//	- The creation of an object precludes its reuse without significant duplication of code
//	- The creation of an object requires access to information or resources that should
//	  not be contained within the composing class
//	- The lifetime management of the generated objects must be centralized to ensure a consistent behavior
//	  within composing class
//
// Factory design pattern diagram can be found here:
// https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg