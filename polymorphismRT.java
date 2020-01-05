
/**
 * Write a description of class polymorphismRT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class polymorphismRT
{
    private int x = 0;
    private int y = 0;
    polymorphismRT(int X, int Y)
    {
        x = X;
        y = Y;
    }
    
    public void setX(int X)
    {
        x = X;
    }
    public void setY(int Y)
    {
        y = Y;
    }
    
    public int Mystery()
    {
        return (x * y);
    }
    
    public static void main(String[] args)
    {
        polymorphismRT p = new polymorphismRT(2,4);
        System.out.println(p.Mystery());
        
        p = new polymorphismRTtest(2,4);
        System.out.println(p.Mystery());
        
        p = new polymorphismRTtest2(2,4);
        System.out.println(p.Mystery());
    }
}
