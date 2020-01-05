
/**
 * Write a description of class inheritanceExtend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inheritanceExtender extends inheritance
{
    private int zPos = 0;//Z position in 3D space
    inheritanceExtender(int X, int Y, int Z)
    {
        super(X, Y);
        zPos = Z;
    }
    public void setZ(int Z)
    {
        zPos = Z;
    }
    public int getZ()
    {
        return zPos;
    }
    
    public static void main(String[] args)
    {
        inheritanceExtender iE = new inheritanceExtender(0, 0, 0);
        System.out.println("The X position is " + iE.getX());
        System.out.println("The Y position is " + iE.getY());
        System.out.println("The Z position is " + iE.getZ());
    }
}
