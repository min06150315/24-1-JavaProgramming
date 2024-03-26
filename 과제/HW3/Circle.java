public class Circle {
    private double firstRadius;
    private double secondRadius;
    
    public void setRaduis(double firstRadius, double secondRadius)
    {
        this.firstRadius = firstRadius;
        this.secondRadius = secondRadius;
    }
    public double calArea1()
    {
        return this.firstRadius * this.firstRadius * 3.14;
    }
    public double calArea2()
    {
        return this.secondRadius * this.secondRadius * 3.14;
    }
    public double calCircumference1()
    {
        return this.firstRadius * 2 * 3.14;
    }
    public double calCircumference2()
    {
        return this.secondRadius * 2 * 3.14;
    }
    public double calRatio(double first, double second)
    {
        return first / second;
    }
}
