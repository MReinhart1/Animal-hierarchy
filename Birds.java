
/**
 * Write a description of class Birds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Birds extends Animals
{
    private int Claws;
	private String BeakColor;
	private String EyeColor;
	public Birds()
	{
		super(2,"blue");
		Claws = 4;
		EyeColor = "red";
	}

	public int compareTo( Object obj)
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
