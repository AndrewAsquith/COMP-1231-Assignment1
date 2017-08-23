//==============================================
// Andrew Asquith
// COMP 1231
// Assignment 1 
// ThreeDimensionalShape Class 
//
// This is the abstract base class for the three dimensional shapes.
// It includes the abstract methods for surfaceArea and volume
// as well as a basic toString utilizing them
//
//==============================================

// import the decimal format since we want to truncate longer numbers on output
import java.text.DecimalFormat;

public abstract class ThreeDimensionalShape {

	//all inheriting classes must define how to calculate their surface area
	public abstract double surfaceArea();
	
	//all inheriting classes must define how to calculate their volume
	public abstract double volume();
	
	//basic toString returning the volume and surface area
	//because we could get really long decimals, we'll use 2 decimal places to make it pretty
	public String toString() {
		
		//number formatter for two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.00"); 
		
		return "Volume is " + formatter.format(volume()) 
				+ " and surface area is " + formatter.format(surfaceArea());
	}
}