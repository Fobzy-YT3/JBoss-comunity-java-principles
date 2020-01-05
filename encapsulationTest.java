
/**
 * Write a description of class encapsulationTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class encapsulationTest
{
    public static void main(String[] args)
    {
        encapsulation obj = new encapsulation(1, 1);
        obj.setX(obj.getX() * 5);
        obj.setY(obj.getY() * 5); 
        
        System.out.println("X is " + obj.getX());
        System.out.println("Y is " + obj.getY());
    }
}
