
/**
 * Write a description of class RectangleClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleClient { 
public static void main (String[] args) {

    int newx;
    int newy;
    int newwidth; 
    int newheight; 
   
Rectangle rect1 = new Rectangle();
rect1.newx= 4;
rect1.newy= 4;
rect1.newwidth = 4;
rect1.newheight = 4;


Rectangle rect2 = new Rectangle();
rect2.newx= 4;
rect2.newy= 4;
rect2.newwidth = 4;
rect2.newheight = 4;


rect1.getHeight();
rect1.getWidth();
rect1.getX();
rect1.getY();
rect1.getArea();

rect2.getHeight();
rect2.getWidth();
rect2.getX();
rect2.getY();
rect2.getArea();
System.out.println("The X coordinate of rect1 is" + " " + rect1.getX());
System.out.println("The Y coordinate of rect1 is" + " " +  rect1.getY());
System.out.println("The X coordinate of rect2 is" +  " " +  rect2.getX());
System.out.println("The Y coordinate of rect1 is" + " " +  rect1.getY());
System.out.println("The area of rect1 is" + " " +  rect1.getArea());
System.out.println("The area of rect2 is" + " " +  rect2.getArea());
// System.out.println("The x and y coordinate of rect1 is" + rect1.getX() + rect1.getY());
// System.out.println("The x and y coordinate of rect2 is" + rect2.getX() + rect2.getY());
}
}
