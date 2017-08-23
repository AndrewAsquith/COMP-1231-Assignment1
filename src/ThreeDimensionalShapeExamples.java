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

		// Exercise the various combinations for a Sphere
		System.out.println(System.lineSeparator() + "=========Sphere=========" + System.lineSeparator());

		// 0 for radius
		Sphere zeroSphere = new Sphere(0);
		System.out.println("Zero Sphere: " + zeroSphere);

		// positive whole number radius
		Sphere positiveWholeSphere = new Sphere(2);
		System.out.println("Positive 2 Sphere: " + positiveWholeSphere);

		// negative whole number radius - should be same as positive above
		Sphere negativeWholeSphere = new Sphere(-2);
		System.out.println("Negative 2 Sphere: " + negativeWholeSphere);

		// positive decimal radius
		Sphere positiveDecimalSphere = new Sphere(3.456);
		System.out.println("Positive 3.456 Sphere: " + positiveDecimalSphere);

		// negative decimal radius - should be same as positive above
		Sphere negativeDecimalSphere = new Sphere(-3.456);
		System.out.println("Negative 3.456 Sphere: " + negativeDecimalSphere);

		// the setter gets exercised through the constructor, but for completeness
		Sphere updateableSphere = new Sphere(0);
		System.out.println("Initial Sphere (0 radius): " + updateableSphere);
		System.out.println("Setting Radius to -3");
		updateableSphere.setRadius(-3);
		System.out.println("Updated Radius: " + updateableSphere.getRadius());
		System.out.println("Updated Sphere: " + updateableSphere);
		
		// Exercise the various combinations for a cuboid/rectangular prism
		System.out.println(System.lineSeparator() + "=========Cuboid=========" + System.lineSeparator());

		// 1 for length, 0 for width, 0 height - a non-existant shape
		Cuboid zeroCuboid = new Cuboid(1, 0, 0);
		System.out.println("Zero Cuboid: " + zeroCuboid);

		// 0 for length, 1 for width, 1 for height
		Cuboid twoDimensionalCuboid = new Cuboid(0, 1, 1);
		System.out.println("2d Cuboid: " + twoDimensionalCuboid);

		// positive whole numbers for lwh
		Cuboid postiveWholeCuboid = new Cuboid(1, 2, 3);
		System.out.println("Positive 1x2x3 Cuboid: " + postiveWholeCuboid);

		// negative whole numbers for lwh - should be same as above
		Cuboid negativeWholeCuboid = new Cuboid(-1, -2, -3);
		System.out.println("Negative 1x2x3 Cuboid: " + negativeWholeCuboid);


		// positive decimals for lwh
		Cuboid positiveDecimalCuboid = new Cuboid(1.234, 2.34, 3.4567);
		System.out.println("Positive Decimal Cuboid: " + positiveDecimalCuboid);

		// negative decimals for lwh - should be same as above
		Cuboid negativeDecimalCuboid = new Cuboid(-1.234, -2.34, -3.4567);
		System.out.println("Negative Decimal Cuboid: " + negativeDecimalCuboid);

		// combination positive decimals and whole numbers for lwh
		Cuboid positiveCombinationCuboid = new Cuboid(1.98, 2, 4.321);
		System.out.println("Positive Whole and Decimal Cuboid: " + positiveCombinationCuboid);

		// combination negative decimals and whole numbers for lwh - should be
		// same as above
		Cuboid negativeCombinationCuboid = new Cuboid(-1.98, 2, -4.321);
		System.out.println("Negative Whole and Decimal Cuboid: " + negativeCombinationCuboid);

		// setter gets exercised through constructor, but for completeness sake show progression
		Cuboid updateableCuboid = new Cuboid(0,0,0);
		System.out.println("Initial Cuboid (0x0x0): " + updateableCuboid);
		System.out.println("Setting Length to -4");
		updateableCuboid.setLength(-4);
		System.out.println("Updated Length: " + updateableCuboid.getLength());
		System.out.println("Updated Cuboid: " + updateableCuboid);
		System.out.println("Setting Width to -5");
		updateableCuboid.setWidth(-5);
		System.out.println("Updated Width: " + updateableCuboid.getWidth());
		System.out.println("Updated Cuboid: " + updateableCuboid);
		System.out.println("Setting Height to -6");
		updateableCuboid.setHeight(-6);
		System.out.println("Updated Height: " + updateableCuboid.getHeight());
		System.out.println("Updated Cuboid: " + updateableCuboid);
		
		// Exercise the various combinations for a cube
		System.out.println(System.lineSeparator() + "=========Cube=========" + System.lineSeparator());

		// 0 for side length
		Cube zeroCube = new Cube(0);
		System.out.println("Zero Cube: " + zeroCube);

		// positive whole number for side length
		Cube positiveCube = new Cube(3);
		System.out.println("Positive 3 Cube: " + positiveCube);

		// negative whole number for side length - should be same as positive
		Cube negativeCube = new Cube(-3);
		System.out.println("Negative 3 Cube: " + negativeCube);

		// positive decimal for side length
		Cube positiveDecimalCube = new Cube(2.3);
		System.out.println("Positive 2.3 Cube: " + positiveDecimalCube);

		// negative decimal for side length - should be same as positive above
		Cube negativeDecimalCube = new Cube(-2.3);
		System.out.println("Negative 2.3 Cube: " + negativeDecimalCube);
		
		// since cube inherits cuboid, make sure the contract is maintained (all sides equal)
		Cube updateableCube = new Cube(0);
		System.out.println("Initial Cube (0x0x0): " + updateableCube);
		System.out.println("Setting Length to -4");
		updateableCube.setLength(-4);
		System.out.println("Updated Length: " + updateableCube.getLength());
		System.out.println("Updated Cube: " + updateableCube);

		System.out.println("Setting Width to -5");
		updateableCube.setWidth(-5);
		System.out.println("Updated Width: " + updateableCube.getWidth());
		System.out.println("Updated Cube: " + updateableCube);

		System.out.println("Setting Height to -6");
		updateableCube.setHeight(-6);
		System.out.println("Updated Height: " + updateableCube.getHeight());
		System.out.println("Updated Cube: " + updateableCube);
	}
}