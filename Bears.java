
/**
 * Write a description of class Bears here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bears extends Animals
{
    private int Weight;
	private String Kind;
	private String EyeColor;
	public Bears()
	{
		super(4,"black");
		Weight = 250;
		EyeColor ="Black Bear";
	}
	public Bears(String Color, String type, int heavy)
	{
		super(4,Color);
		Weight = heavy;
		EyeColor ="Black Bear";
		Kind = type;
	}
	public int compareTo( Object obj)
	{
		int myLegs = super.getNumberOfLegs();
		int otherLegs = ((Animals)obj).getNumberOfLegs();
		return myLegs - otherLegs;
	}
	
	public String toString()
	{
		return super.toString() +" is  " + Weight +" lbs. and is a " + Kind;
	}
}
