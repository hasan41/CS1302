
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Comparable<Circle> 
{
    // instance variables - replace the example below with your ow
  private int radius;
   Point p ;
  
    public Circle(int radius, int x, int y) {
        this.radius = radius;
         p = new Point(x,y);
        
    }

    public int getRadius() {
        return radius;
    }
    public Point getPoint() {
        return p;
    }
    
    public String toString() {
        return "(" + radius + "," + p + ")";
    }

    public int compareTo(Circle other) {
        if (radius==other.radius) 
            return p.compareTo(other.p); 
            
       else
            return radius - other.radius;
        
    
}
}
