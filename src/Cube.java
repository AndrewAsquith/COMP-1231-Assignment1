//==============================================
// Andrew Asquith
// COMP 1231
// Assignment 1 
// Cube Class 
//
// This is the Cube class.
// A Cube is just a specialized Cuboid where all sides are equal
// so it simply calls the parent's constructor setting length, width and 
// height to the provided length of the side, the implementations for 
// volume and surface area do not need to be changed but mutators 
// are overridden to ensure the implied contract of all sides 
// being equal is maintained
//
//==============================================

public class Cube extends Cuboid {

	// constructor taking the length of the sides
	public Cube(double lengthOfSide) {

		// Cubes are just special case cuboids where length, width and height are all equal
		super(lengthOfSide, lengthOfSide, lengthOfSide);
	}

	// public mutator for length - need to override the parent to ensure all sides are equal
	public void setLength(double newLength) {
		
		// call the parent mutators instead of re-implementing
		super.setLength(newLength);
		super.setWidth(newLength);
		super.setHeight(newLength);
	}

	// public mutator for width - need to override the parent to ensure all sides are equal
	public void setWidth(double newWidth) {

		// call the parent mutators instead of re-implementing
		super.setLength(newWidth);
		super.setWidth(newWidth);
		super.setHeight(newWidth);
	}

	// public mutator for height - need to override the parent to ensure all sides are equal
	public void setHeight(double newHeight) {
		
		// call the parent mutators instead of re-implementing
		super.setLength(newHeight);
		super.setWidth(newHeight);
		super.setHeight(newHeight);
	}
}