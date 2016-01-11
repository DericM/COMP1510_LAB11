package q3;


public class Cylinder extends Shape
{
	private double radius; //radius in feet
	private double height;
	
	public Cylinder(double r, double h)
	{
		super("Cylinder");
		radius = r;
		height = h;
	}

	public double area()
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}
	

	public String toString()
	{
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}