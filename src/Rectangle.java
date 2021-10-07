public class Rectangle implements Comparable<Rectangle>
{
    private double length;
    private double width;

    public Rectangle()// done
    {
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double l, double w) // done
    {
        setLength(l);
        setWidth(w);
    }

    public Rectangle(Rectangle r) //done
    {
        length = r.getWidth();
        width = r.getLength();

    }

    public double getLength() // done
    {
        return length;
    }

    public double getWidth() // done
    {
        return width;
    }

    public void setLength(double l) // done
    {
        length = l;
    }

    public void setWidth(double w) // done
    {
        width = w;
    }

    public double calcArea() //done
    {
        return length * width;
    }

    public boolean equals(Rectangle r) // done
    {
        // tests whether this and r have the same dimension

        if(width == r.getWidth() && length == r.getLength()){
            return true;
        }
        return false;
    }

    public static boolean sameDimensions(Rectangle r1, Rectangle r2) // done
    {
        // tests whether r1 and r2 have the same dimensions
        if (r1.getWidth() == r2.getWidth() && r1.getLength() == r2.getLength()){
            return true;
        }
        return false;
    }

    public int compareTo(Rectangle r) // done
    {
        // based on area of this and r Rectangles
        double x = this.calcArea();
        double y = r.calcArea();

        if(x > y){
            return 1;
        }
        else if(x < y){
            return -1;
        }
        else return 0;
    }

    public static Rectangle largerArea(Rectangle r1, Rectangle r2) //done
    {
        if (r1.calcArea() > r2.calcArea()){
            return r1;
        } else return r2;
    }

    public Rectangle equivalentSquare() //done
    {
        // returns Rectangle which is a square of the same area
        Rectangle square;
        return square = new Rectangle(Math.sqrt(this.calcArea()), Math.sqrt(this.calcArea()));
    }

    public String toString()
    {
        return "[ length: " + length + ": Width " + width + "]";
    }
}