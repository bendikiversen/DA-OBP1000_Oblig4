public class Sphere extends Circle
{
	//Declare variables
	private double innerRadius;
	private double thickness;

	//Default constructor
	public Sphere()
	{
		super();
		thickness = 0.25;
	}

	//Constructor with arguments
	public Sphere(double radius, double thickness)
	{
		super(radius);
		this.thickness = thickness;
	}

	public double getThickness()
	{
		return thickness;
	}

	public void setThickness()
	{
		this.thickness = thickness;
	}


	public double findVolume()
	{
		return (4.0/3.0) * Math.pow(getRadius(), 3)*Math.PI; //Formula: (4/3) * PI * radius^3
	}

	public double findInnerVolume() 
	{
		innerRadius = getRadius() - thickness;
		return (4.0/3.0) * Math.pow(innerRadius, 3) * Math.PI;
	}

	public double findMetalVolume()
	{
		return findVolume() - findInnerVolume();
	}

	public double findSurfaceArea()
	{
		return 4 * findArea(); //Formula: 4 * PI * radius^2
	}

	public double findWeight()
	{
		return (findMetalVolume() / 1000) * IRONDENSITY; //cm to dm
	}

	public String toString() //Relevant information about object, calls methods
	{
		return "Sphere with thickness "+ thickness +" and " + super.toString()  +
		"\n\tOuter volume: " + roundDec(findVolume()) + " cm^3" +
		"\n\tInner volume: " + roundDec(findInnerVolume()) + " cm^3" +
		"\n\tMetal volume: " + roundDec(findMetalVolume()) + " cm^3" +
		"\n\tSurface area: " + roundDec(findSurfaceArea()) + " cm^2" +
		"\n\tWeight: " + roundDec(findWeight()) + " kg \n";
	}
}