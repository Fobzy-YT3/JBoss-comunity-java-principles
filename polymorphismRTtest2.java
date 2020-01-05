
/**
 * Write a description of class polymorphismRTtest2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class polymorphismRTtest2 extends polymorphismRT
{
    private int x = 0;
    private int y = 0;
    polymorphismRTtest2(int X, int Y)
    {
        super(X, Y);
        x = X;
        y = Y;
    }
    public int Mystery()
    {
        return (y * y)/(x * x);
    }
}
