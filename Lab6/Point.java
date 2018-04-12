
public class Point
{
  private int x;
  private int y;
  public Point() {
      this(0,0);
    }
    public Point(int x, int y) {
        setLocation(x,y);
    }
    public boolean equals (Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        }
        else {
            return false;
        }
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
}

 interface Colored {
    public String getColor();
}

 class ColoredPoint extends Point implements Colored{
     private String Color;
 public ColoredPoint(int x, int y, String Color) {
super(x,y);
this.Color = Color;
}
public String getColor() {
    return Color;
}
public String toString() {
    return super.toString() + "," + Color;
}
 public boolean equals (Object o) {
        if (o instanceof ColoredPoint) {
            ColoredPoint other = (ColoredPoint) o;
            return (this.getX() == other.getX() && this.getY() == other.getY()) && this.Color.equals(other.Color);
        }
        else {
            return false;
        }
    }
}

