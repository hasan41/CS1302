
/**
 * Write a description of class ColoredClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColoredClient
{
    public static void main (String[] args) {
        ColoredPoint a1 = new ColoredPoint(1,1,"blue");
        ColoredPoint b1 = new ColoredPoint(1,1,"green");
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(a1.equals(b1));
    }
}
