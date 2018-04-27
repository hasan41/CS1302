
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
    // instance variables - replace the example below with your own
   
    public static String starString(int x)
    {
         if (x <= 0) {
           return "*";
        }
        
     
    else {
        String s = starString(x-1);
        return s + s;
}
    }
    public static void main (String[] args) {
        System.out.println(starString(10));
    }
    
}
