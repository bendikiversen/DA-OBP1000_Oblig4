public class Cylinder extends Circle
{
	//Declare variables
	private double height;
	private double innerRadius;
	private double innerHeight;
	private double thickness;

	//Default constructor
	public Cylinder()
	{
		super();
		height = 1.0;
		thickness = 0.25;
	}

	//Constrctor with arguments
	public Cylinder(double radius, double height, double thickness)
	{
		super(radius);
		this.height = height;
		this.thickness = thickness;

	}

	public double getHeight()
	{
		return height; //returns height
	}

	public void setHeight(double height)
	{
		this.height = height; //Sets a new height
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
		return findArea() * height; //Formula: [PI * radius^2] * height.
	}

	//Calculates volume inside metal object
	public double findInnerVolume()
	{
		innerRadius = getRadius() - thickness;
		innerHeight = height - 2 * thickness;
		return Math.pow(innerRadius, 2) * Math.PI * innerHeight;
	}

	public double findMetalVolume()
	{
		return findVolume() - findInnerVolume();
	}

	public double findSurfaceArea()
	{
		return findCircumference() * height + 2 * findArea(); //Formula: [2 * radius * PI] * height + [PI * radius^2]
	}

	public double findWeight()
	{
		return (findMetalVolume() / 1000) * IRONDENSITY; //cm to dm
	}

	public String toString() //Relevant information about object, calls methods
	{
		return "Cylinder with thickness "+ thickness +", height " + height + " and " + super.toString() +
		"\n\tOuter volume: " + roundDec(findVolume()) + " cm^3" +
		"\n\tInner volume: " + roundDec(findInnerVolume()) + " cm^3" +
		"\n\tMetal volume: " + roundDec(findMetalVolume()) + " cm^3" +
		"\n\tSurface area: " + roundDec(findSurfaceArea()) + " cm^2" +
		"\n\tWeight: " + roundDec(findWeight()) + " kg \n";
	}
}