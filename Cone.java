public class Cone extends Circle
{
	//Declare variables
	private double height;
	private double side;
	private double vThickness;
	private double innerRadius;
	private double innerHeight;
	private double thickness;

	//Default constructor
	public Cone()
	{
		super();
		height = 1.0;
		thickness = 0.25;
	}

	//Constructor with arguments
	public Cone(double radius, double height, double thickness)
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
		this.height = height; //sets a new height
	}

	public double getThickness()
	{
		return thickness;
	}

	public void setThickness()
	{
		this.thickness = thickness;
	}

	public double findSide()
	{
		return Math.sqrt(Math.pow(height, 2) + Math.pow(getRadius(), 2));
	}
	
	public double findVolume()
	{
		return (1.0/3.0) * findArea() * height;
	}

	//Calculates volume inside metal object
	public double findInnerVolume() 
	{
		vThickness = (thickness*findSide())/getRadius();
		innerHeight = height - thickness - vThickness;
		innerRadius = getRadius() * (innerHeight/height);
		return (1.0/3.0) * Math.pow(innerRadius, 2) * Math.PI * innerHeight;
	}

	public double findMetalVolume()
	{
		return findVolume() - findInnerVolume();
	}

	public double findSurfaceArea() //Formula: 
	{
		return (Math.PI * getRadius()) * (getRadius() + findSide());
	}

	public double findWeight()
	{
		return (findMetalVolume() / 1000) * IRONDENSITY; //cm^3 to dm^3
	}

	public String toString() //Relevant information about object, calls methods
	{
		return "Cone with thickness "+ thickness +", height " + height + " and " + super.toString() +
		"\n\tOuter volume: " + roundDec(findVolume()) + " cm^3" +
		"\n\tInner volume: " + roundDec(findInnerVolume()) + " cm^3" +
		"\n\tMetal volume: " + roundDec(findMetalVolume()) + " cm^3" +
		"\n\tSurface area: " + roundDec(findSurfaceArea()) + " cm^2" +
		"\n\tWeight: " + roundDec(findWeight()) + " kg \n";
	}
}