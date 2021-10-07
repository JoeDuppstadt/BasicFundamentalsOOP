
public class Block extends Rectangle
{
    private double height;

    public Block() //done
    {
        super(0,0);
        setHeight(0);
    }

    public Block(double l, double w, double h) //done
    {
        super(l, w);
        setHeight((int) h);
    }

    public Block(Block b)  //done
    {
        super(b.getLength(), b.getWidth());
        setHeight((int) b.getHeight());
    }

    public double getHeight() //done
    {
        return height;
    }

    public void setHeight(int h) // done
    {
        height = h;
    }

    public double calcArea() //done
    {
        double bottomArea =  2 * super.calcArea();
        double topArea = (2 * this.getWidth() * this.getHeight()) + (2 * this.getHeight() * this.getLength());
        // return surface area of this
        return bottomArea + topArea;

    }

    public static double calcArea(Block b) //done
    {
        // return surface area of b
        return (2 * b.getLength() * b.getWidth()) + (2 * b.getWidth() * b.getHeight()) + (2 * b.getHeight() * b.getLength());

    }

    public double calcVolume() // done
    {

         return (super.calcArea() * this.getHeight());
    }

    public boolean equals(Block b) //done
    {
        // based on dimensions of this and b being the same
        if(super.equals(b) == true && this.getHeight() == b.getHeight()){
            return true;
        }
        return false;
    }

    public int compareTo(Rectangle r)  //done
    {
        // compare this and r Blocks based on volume
        double x = r.calcArea();
        double y = this.calcVolume();
        System.out.println(x);
        if(x > y){
            return 1;
        }
        else if(x < y){
            return -1;
        }
        else return 0;
    }

    public Block equivalentCube() //done
    {
        // returns cube with same volume as this block
        Block b;
        return b = new Block(Math.cbrt(this.calcVolume()),Math.cbrt(this.calcVolume()),Math.cbrt(this.calcVolume()));

    }


    public String toString()
    {
       return super.toString() + "Height: " + this.height;
    }

}
