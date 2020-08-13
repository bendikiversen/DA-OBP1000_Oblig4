public class FiguresProgram
{
	public static void main(String[] args)
	{
		//Cylinder (args: radius, height, thickness)
		Cylinder myCylinder = new Cylinder(4, 7, 1);
		System.out.println(myCylinder);

		//Cone (args: radius, height, thickness)
		Cone myCone = new Cone(5, 12, 1);
		System.out.println(myCone);

		//Sphere (args: radius, thickness)
		Sphere mySphere = new Sphere(4, 1);
		System.out.println(mySphere);

		//Box (args: width, height, length, thickness)
		Box myBox = new Box(10, 5, 10, 1);
		System.out.println(myBox);
	} //End of main
} //End of class FiguresProgram