package HW3;

public class Circle 
{
	private int firstRadius;
	private int secondRadius;
	private double area;
	private double circumference;
	private double ratio;
	public void setFirstRadius(int radius)
	{
		this.firstRadius = radius;
	}
	public void setSecondRadius(int radius)
	{
		this.secondRadius = radius;
	}
	public void calculateArea()
	{
		this.area = this.firstRadius * this.firstRadius * 3.14;
	}
	public void calculateCircumference()
	{
		this.area = this.firstRadius * 2 * 3.14;
	}
	public void calculateRatioArea() 
	{
        this.ratio = this.area / (this.secondRadius * this.secondRadius * 3.14);
    }
	public double getArea()
	{
		return this.area;
	}
	public double getCircumference()
	{
		return this.circumference;
	}
	public double getRatioArea()
	{
		return this.ratio;
	}
}
