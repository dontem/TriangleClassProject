
public class Triangle extends GeometricObject {

	// The class has data fields called side1, side2, and side 3 with default
	// values 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// No-arg constructor that creates default triangle
	public Triangle() {

	}

	// A constructor that creates a triangle with specified side1, side2, and
	// side3
	public Triangle(double side1, double side2, double side3) {

	}

	// Accessor methods for all three data fields
	public double getSide1() {
		return side1;

	}

	public void setSide1(double val) {
		this.side1 = val;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide3(double val) {
		this.side3 = val;
	}

	// Area method that returns the area of the triangle

	public double getArea() {
		double x = getPerimeter() / 2;
		return Math.sqrt(x * ((x - side1) * (x - side2) * (x - side3)));

	}

	// Perimeter method that returns the perimeter of the triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// String method that returns a string description for the triangle
	public String toString() {
		return "Area = " + String.format("%.2f", getArea()) + "; Perimeter = "
				+ String.format("%.2f", getPerimeter());

	}

}
