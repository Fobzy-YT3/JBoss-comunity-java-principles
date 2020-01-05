
/**
 * Write a description of class inheritance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inheritance
{
    private int xPos = 0;//X position in 2D space
    private int yPos = 0;//Y position in 2D space
    inheritance(int X, int Y)
    {
        xPos = X;
        yPos = Y;
    }
    
    public void setX(int X)
    {
        xPos = X;
    }
    public void setY(int Y)
    {
        yPos = Y;
    }
    public int getX()
    {
        return xPos;
    }
    public int getY()
    {
        return yPos;
    }
}
