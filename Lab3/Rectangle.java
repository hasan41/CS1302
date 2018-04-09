import java.util.*;
public class Rectangle
{
    int newx;
    int newy;
    int newwidth;
    int newheight;


    public void setFields(int newx, int newy, int newwidth, int newheight)
    {

        this.newx = newx;
        this.newy = newy;
        this.newwidth = newwidth;
        this.newheight = newheight;




}
public int getHeight() {

       return newheight;


    }

    public void getWidth() {
        return newwidth;
    }

    public int getX() {
        return newx;
    }

    public int getY() {
        return newy;
    }

    public int getArea() {
        return newwidth*newheight;
}
}
