import java.awt.Point;

public class Circle {
	private int Area;
	private Point p;
	private int radius;
	
	public Circle(Point p, int radius) {
		this.p=p;
		this.radius=radius;
	}
	
	public Point getCenter() {
		return p;
	}
	
	public int getradius() {
		return radius;
	}
	
	
	public int getArea() {
		return Area = (int) (radius * radius * Math.PI);

	}
	
	public int getCircumference(int radius) {
		return (int) (2 * Math.PI * radius);

	}
	
	public String toString() {
		return "Circle[center" + "," + "radius=" + radius + "]"; 
	}
}
