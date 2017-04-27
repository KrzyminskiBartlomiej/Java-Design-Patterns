package AbstractFactory;

public interface Color {
	void fill();
}

// That interface ensure polymorphism to every Class that inherits from this.
// Common method fill() is used to show what kind of shape we want to fill
// in this case there are three Classes representing various colors:
// Red, Blue, Yellow