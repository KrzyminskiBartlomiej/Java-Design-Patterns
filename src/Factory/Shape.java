package Factory;

public interface Shape {
	void draw();
}

// That interface ensure polymorphism to every Class that inherits from this.
// Common method draw() is used to show what kind of shape we want to draw
// in this case there are three Classes representing various shapes:
// Rectangle, Square, Circle