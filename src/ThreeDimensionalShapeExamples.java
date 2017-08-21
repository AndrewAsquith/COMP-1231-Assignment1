//==============================================
// Andrew Asquith
// COMP 1231
// Assignment 1 
// ThreeDimensionalShapeExamples Class 
//
// This is the driver/examples class for the three dimensional shapes.
// It instantiates various permutations of the shapes and 
// prints them to the console
//
//==============================================
public class ThreeDimensionalShapeExamples {

	public static void main(String[] args) {

		
		//Exercise the various combinations for a Sphere
		System.out.println(System.lineSeparator() + "=========Sphere=========" + System.lineSeparator());
		
		// 0 for radius
		Sphere zeroSphere = new Sphere(0);
		System.out.println(zeroSphere);
		
		// positive whole number radius
		Sphere positiveWholeSphere = new Sphere(2);
		System.out.println(positiveWholeSphere);
		
		// negative whole number radius - should be same as positive above
		Sphere negativeWholeSphere = new Sphere(-2);
		System.out.println(negativeWholeSphere);
		
		// positive decimal radius
		Sphere positiveDecimalSphere = new Sphere(3.456);
		System.out.println(positiveDecimalSphere);
		
		// negative decimal radius - should be same as positive above
		Sphere negativeDecimalSphere = new Sphere(-3.456);
		System.out.println(negativeDecimalSphere);
		
		
		//Exercise the various combinations for a cuboid/rectangular prism
		System.out.println(System.lineSeparator() + "=========Cuboid=========" + System.lineSeparator());
		
		// 1 for length, 0 for width, 0 height - a non-existant shape
		Cuboid zeroCuboid = new Cuboid(1, 0, 0);
		System.out.println(zeroCuboid);
		
		// 0 for length, 1 for width, 1 for height
		Cuboid twoDimensionalCuboid = new Cuboid(0, 1, 1);
		System.out.println(twoDimensionalCuboid);
		
		// positive whole numbers for lwh
		Cuboid postiveWholeCuboid = new Cuboid(1,2,3);
		System.out.println(postiveWholeCuboid);
		
		// negative whole numbers for lwh - should be same as above
		Cuboid negativeWholeCuboid = new Cuboid(-1,-2,-3);
		System.out.println(negativeWholeCuboid);
		
		// positive decimals for lwh
		Cuboid positiveDecimalCuboid = new Cuboid(1.234, 2.34, 3.4567);
		System.out.println(positiveDecimalCuboid);
		
		// negative decimals for lwh - should be same as above
		Cuboid negativeDecimalCuboid = new Cuboid(-1.234, -2.34, -3.4567);
		System.out.println(negativeDecimalCuboid);
		
		// combination positive decimals and whole numbers for lwh
		Cuboid positiveCombinationCuboid = new Cuboid(1.98, 2, 4.321);
		System.out.println(positiveCombinationCuboid);
		
		// combination negative decimals and whole numbers for lwh - should be same as above
		Cuboid negativeCombinationCuboid = new Cuboid(-1.98, 2, -4.321);
		System.out.println(negativeCombinationCuboid);
		
		
		//Exercise the various combinations for a cube
		System.out.println(System.lineSeparator() + "=========Cube=========" + System.lineSeparator());
		
		//0 for side length
		Cube zeroCube = new Cube(0);
		System.out.println(zeroCube);
		
		//positive whole number for side length
		Cube positiveCube = new Cube(3);
		System.out.println(positiveCube);
		
		//negative whole number for side length - should be same as positive above
		Cube negativeCube = new Cube(-3);
		System.out.println(negativeCube);
		
		//positive decimal for side length
		Cube positiveDecimalCube = new Cube(2.3);
		System.out.println(positiveDecimalCube);
		
		//negative decimal for side length - should be same as positive above
		Cube negativeDecimalCube = new Cube(-2.3);
		System.out.println(negativeDecimalCube);
	}

}
