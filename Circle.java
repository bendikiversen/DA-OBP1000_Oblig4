public abstract class Circle extends GeometricObject
{
	//Declare variables
	private double radius;

	//Default constructor
	public Circle()
	{
		radius = 1.0;
	}

	//Constructor with argument
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius; //returns radius
	}

	public void setRadius(double radius)
	{
		this.radius = radius; //sets a new radius
	}

	public double findArea()
	{
		return Math.pow(radius, 2)*Math.PI; //Formula: PI*radius^2
	}

	public double findCircumference()
	{
		return 2*radius*Math.PI; //Formula: 2*radius*PI
	}

	public String toString() //Relevant information about object, to be inherited by 3D-objects
	{
		return "radius " + radius + ". "+super.toString();
	}
}