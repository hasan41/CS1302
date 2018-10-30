import java.util.*;
//import java.util.ArrayList;
public class Rectangle implements Comparable<Rectangle>{
	private int height;
	private int width;
	private Point topCorner;
	
	public Rectangle(int height, int width, Point topCorner) {
		this.height = height;
		this.width = width;
		this.topCorner = topCorner;
	}
	
	public Rectangle() {
        this(0,0,new Point());
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	
	public void setTopCorner(Point s) {
		this.topCorner = s;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public Point getTopCorner() {
		return topCorner;
	}
	
	public String toString() {
		return "Width: " + width + "\t" + "Height" + height + "\t" + topCorner;
	}	
	
	public int compareTo(Rectangle o) {
		if(width == o.width) {
			if(height == o.height) {
				return topCorner.compareTo(o.topCorner);
			}
			return height - o.height;
		}
		return width - o.width;
	}

	
}
