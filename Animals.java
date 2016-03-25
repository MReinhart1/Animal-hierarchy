
/**
 * Write a description of class Animals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animals
{
    private String Color;
    private int numberOfLegs;


    public Animals (){    	
        numberOfLegs = 4;
        Color = "black";
    }
    
    
    public Animals (int Legs, String color)
    {
        numberOfLegs = Legs;
        Color = color;
    }

    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }

    public String getColor()
    {
        return Color;
    }

    public void setColor( String newColor)
    {
        Color = newColor;
    }

    public String toString()
    {
        return "Color " + Color + " Number of Legs " + numberOfLegs;
    }
}
