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
// volume and surface area do not need to be changed
//
//==============================================

public class Cube extends Cuboid {

	//constructor taking the length of the sides
	public Cube(double lengthOfSide) {
		
		//Cubes are just special case cuboids where length, width and height are all equal
		super(lengthOfSide, lengthOfSide, lengthOfSide);
	}
}
