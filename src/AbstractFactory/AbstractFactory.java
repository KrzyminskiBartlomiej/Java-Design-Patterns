package AbstractFactory;

import Factory.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}

// Difference between abstract class and interface
//
// Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods.
// Abstract class and interface both can not be instantiated.
// But there many differences that are given below:
//
// 	ABSTRACT CLASS:
//		- Can have abstract and non-abstract methods
//		- Does not support multiple inheritance
//		- Can have final, non-final, static, non-static variables
//		- Can provide the implementation of inheritance
//		- Abstract method is used to declare abstract class
//
//	INTERFACE:
//		- Can have only abstract methods. Since Java 8, it can have also default and static methods
//		- Supports multiple inheritance
//		- Has only static and final variables
//		- Can NOT provide the implementation of abstract class
//		- The interface keyword is used to declare interface
//
//  Abstract Factory diagram can be found here: https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg