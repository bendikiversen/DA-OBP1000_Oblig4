public abstract class GeometricObject
{
	private java.util.Date dateCreated;
	static protected final double IRONDENSITY = 7.8; //final and shared variable

	//default constructor, sets current date as dateCreated
	protected GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}

	public java.util.Date getDateCreated()
	{
		return dateCreated; //returns creation date
	}

	public String toString() //Relevant information about object, to be inherited by 2D-objects (and 3D-objects)
	{
		return "Created on " + dateCreated + ":";
	}

	public double roundDec(double a) //Method to round a double to two decimal points
	{
		return (double) Math.round(a * 100) / 100;
	}

	public abstract double findArea();
	public abstract double findVolume();
	public abstract double findCircumference();
	public abstract double findSurfaceArea();
	public abstract double findMetalVolume();
	public abstract double findWeight();

}