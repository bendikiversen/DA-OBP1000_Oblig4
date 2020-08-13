public abstract class Rectangle extends GeometricObject
{
	//Declare variables
	private double width;
	private double height;

	//Default constructor
	public Rectangle()
	{
		width = 1.0;
		height = 1.0;
	}

	//Constructor with arguments
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public double getWidth()
	{
		return width; //returns width
	}

	public void setWidth(double width)
	{
		this.width = width; //sets a new width
	}

	public double getHeight()
	{
		return height; //returns height
	}

	public void setHeight(double height)
	{
		this.height = height; //sets a new height
	}

	public double findArea()
	{
		return width*height; //Formula: width * height
	}

	public double findCircumference()
	{
		return 2 * (width + height); //Formula: 2 * (width + height)
	}

	public String toString() //Relevant information about object, to be inherited by 3D-objects
	{
		return "width "+ width + " and height " + height + ". " + super.toString(); 
	}

}