
/**
 * Write a description of class polymorphismRTtest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class polymorphismRTtest extends polymorphismRT
{
    private int x = 0;
    private int y = 0;
    polymorphismRTtest(int X, int Y)
    {
        super(X, Y);
        x = X;
        y = Y;
    }
    public int Mystery()
    {
        return (x * x)-(y * y);
    }
}
