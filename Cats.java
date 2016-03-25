
/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cats extends Animals
{
    private int Claws;
	private String EyeColor;
	
	public Cats()
	{
		super();
		Claws = 13;
		EyeColor ="blue";
	}

	public int compareTo(Object obj)
	{
		int myLegs = super.getNumberOfLegs();
		int otherLegs = ((Animals)obj).getNumberOfLegs();
		return myLegs - otherLegs;
	}
	
	public String toString()
	{
		return super.toString() +" with  " + Claws +" claws and an eyecolor of " + EyeColor;
	}
}
