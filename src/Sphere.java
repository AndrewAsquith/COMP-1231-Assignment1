//==============================================
// Andrew Asquith
// COMP 1231
// Assignment 1 
// Sphere Class 
//
// This is the Sphere class.
// It defines a private variable for the radius and 
// implements the abstract methods for surfaceArea and volume
// negative values for radius are converted to positive
// 0 is acceptable as the radius
//
//==============================================

// bring in the decimal format since we want to truncate longer numbers
import java.text.DecimalFormat;

public class Sphere extends ThreeDimensionalShape {

	// private member to hold the radius
	private double radius;

	// constructor taking the one piece of data we need for a sphere, the radius
	public Sphere(double r) {
		
		//use the mutator to ensure radius conforms to expectations
		setRadius(r);
	}
	
	//public accessor for radius
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		
		// negative values don't make any sense, use absolute value
		radius = Math.abs(newRadius);
	}

	// implementation of the abstract surfaceArea method from the parent
	public double surfaceArea() {

		// surface area of a sphere is 4*pi*r2
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	// implementation of the abstract method from the parent
	public double volume() {

		// volume of a sphere is (4/3) * pi * r3
		return ((double)4 / 3) * Math.PI * Math.pow(radius, 3);
	}

	// return the radius and the parent's toString representation
	// as with the base class we format to four decimal places
	public String toString() {
		
		//number formatter for four decimal places
		DecimalFormat formatter = new DecimalFormat("#0.0000");

		return "Radius is " + formatter.format(radius) + ", " + super.toString();
	}
}
