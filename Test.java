
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String args[]){
        Bears BlackBear = new Bears("Black","Black Bear", 225);
        Bears PolarBear = new Bears("White", "Polar Bear",39094954);
        Animals Bird = new Birds();
        Animals Cat = new Cats();
        Animals Animal = new Animals();
        System.out.println("BlackBear");
        System.out.print(BlackBear);
        System.out.println();
        System.out.println("PolarBear");
        System.out.print(PolarBear);
        System.out.println();
        System.out.println("Bird");
        System.out.print(Bird);
        System.out.println();
        System.out.println("Cat");
        System.out.print(Cat);
        System.out.println();
        System.out.println("Animal");
        System.out.print(Animal);
        System.out.println();
        System.out.println(PolarBear.compareTo(BlackBear));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
