
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point implements Comparable<Point>
{
  private int x;
  private int y;
 
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public void translate(int dx, int dy) {
        setLocation(x+dx, y+dy);
    }
    public int compareTo(Point pt) {
        if(x==pt.x) 
            return y - pt.y; 
          else
            return x - pt.x;
        }
    }
