
/**
 * Write a description of class encapsulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class encapsulation
{
    private int x = 0;
    private int y = 0;
    
    encapsulation(int X,int Y)
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
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    
}
