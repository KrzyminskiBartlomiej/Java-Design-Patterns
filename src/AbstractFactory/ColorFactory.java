package AbstractFactory;

import Factory.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null) return null;
		else if(color.equalsIgnoreCase("RED")) return new Red();
		else if(color.equalsIgnoreCase("BLUE")) return new Blue();
		else if(color.equalsIgnoreCase("YELLOW")) return new Yellow();
		return null;
	}
}