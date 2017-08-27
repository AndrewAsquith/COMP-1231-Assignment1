//==============================================
// Andrew Asquith
// COMP 1231
// Assignment 1 
// Cuboid Class 
//
// This is the base class for the Cuboids (rectangualr prisms).
// It defines private variables for length, width, height
// and provides an implementation of the surfaceArea and volume methods
// negative values for any side are converted to positive
// zero is acceptable as any dimension
//
//==============================================

// import the decimal format since we want to truncate longer numbers
import java.text.DecimalFormat;

public class Cuboid extends ThreeDimensionalShape {

	// cuboids have a length, width and height
	private double length, width, height;

	// Constructor taking the three dimensions needed
	public Cuboid(double l, double w, double h) {

		//use the mutator methods to ensure dimensions conform to expectations
		setLength(l);
		setWidth(w);
		setHeight(h);
	}
	
	//public accessor to return the length
	public double getLength() {
		return length;
	}
	
	//public mutator to set the length
	public void setLength(double newLength) {
		
		// negative values don't make any sense, use absolute value
		length = Math.abs(newLength);
	}
	
	//public accessor for width
	public double getWidth() {
		return width;
	}
	
	//public mutator to set the width
	public void setWidth(double newWidth) {
		
		// negative values don't make any sense, use absolute value
		width = Math.abs(newWidth);
	}
	
	//public accessor for the height
	public double getHeight() {
		return height;
	}
	
	//public mutator to set the height
	public void setHeight(double newHeight) {
		
		// negative values don't make any sense, use absolute value
		height = Math.abs(newHeight);
	}

	// implementation of the abstract surfaceArea method from the parent class
	public double surfaceArea() {

		// surface area of a cuboid is 2wl + 2lh + 2hw
		return (2 * width * length) + (2 * length * height) + (2 * height * width);
	}

	// implementation of the abstract volume method from the parent class
	public double volume() {

		// volume of a cuboid is length * width * height
		return length * width * height;
	}

	// toString method returning the dimensions and the parent's implementation
	// as with the base class we format to two decimal places
	public String toString() {
		
		//number formatter for two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.0000");

		return "Length: " + formatter.format(length) + " width: " 
				+ formatter.format(width) + " height: "
				+ formatter.format(height) 
				+ " - " + super.toString();
	}
}