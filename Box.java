public class Box extends Rectangle
{
	//Declare variables
	private double length;
	private double innerWidth;
	private double innerHeight;
	private double innerLength;
	private double thickness;

	//Default constructor
	public Box()
	{
		super();
		length = 1.0;
		thickness = 0.25;
	}

	//Constructor with arguments
	public Box(double width, double height, double length, double thickness)
	{
		super(width, height);
		this.length = length;
		this.thickness = thickness;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
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
		return findArea() * length; //Formula: [width * height] * length
	}

	public double findInnerVolume()
	{
		innerWidth = getWidth() - 2 * thickness;
		innerHeight = getHeight() - 2 * thickness;
		innerLength = length - 2 * thickness;
		return innerWidth * innerHeight * innerLength;
	}

	public double findMetalVolume()
	{
		return findVolume() - findInnerVolume();
	}


	public double findSurfaceArea() //Formula: 2lw + 2lh + 2wh
	{
		return 2 * length * getWidth() + 2 * length * getHeight() + 2 * getWidth() * getHeight();
	}

	public double findWeight()
	{
		return (findMetalVolume() / 1000) * IRONDENSITY; //cm to dm
	}

	public String toString() //Relevant information about object, calls methods
	{
		return "Box with thickness " + thickness +", length " + length + ", " + super.toString() +
		"\n\tOuter volume: " + roundDec(findVolume()) + " cm^3" +
		"\n\tInner volume: " + roundDec(findInnerVolume()) + " cm^3" +
		"\n\tMetal volume: " + roundDec(findMetalVolume()) + " cm^3" +
		"\n\tSurface area: " + roundDec(findSurfaceArea()) + " cm^2" +
		"\n\tWeight: " + roundDec(findWeight()) + " kg \n";
	}
}