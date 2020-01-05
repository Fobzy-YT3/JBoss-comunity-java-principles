
/**
 * Write a description of class abstractionTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
public class abstractionTest extends abstraction 
{
    abstractionTest(int x,int y)
    {
       super(x,y); 
    }
    
    public int sum()
    {
        return x + y;
    }
    
    public static void main(String[] args)
    {
        abstractionTest a = new abstractionTest(10,10);  
        System.out.println(a.sum());
    }
}
