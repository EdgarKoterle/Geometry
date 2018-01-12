package sk.akademiasovy.geometry2D;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle ()
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getPerimeter()
    {
        return a+b+c;
    }

    @Override
    public double getArea()
    {
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public boolean isRectangular()
    {
       if (a*a+b*b==c*c)
           return true;
       else if (c*c+a*a==b*b)
           return true;
       else if (b*b+c*c==a*a)
           return true;

       else
           return false;
    }

    public boolean existsTriangle()
    {

    }

    public boolean isEquilateral()
    {

    }

    public boolean isIsosceles()
    {

    }
}
