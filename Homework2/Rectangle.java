public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Rectangle ( int newx, int newy, int newwidth, int newheight) {
        x = newx;
        y = newy;
        width = newwidth;
        height = newheight;
    }
    
    
     public int getX() {
     return x;
    }
     
    public int getY() {
     return y;
    }
    
    public int getWidth() {
     return width;
    }
    
    public int getHeight() {
     return height;
    }
    
    public String toString() {
    return "{" + "(" + getX() + "," + getY() + ")" + ", " + getWidth() + "," + getHeight() + "} ";
}
    
    public boolean contains(int new_x, int new_y) {
        if ( (new_x > x + width && new_y> y + height) || (new_x < x - width && new_y < y - height)) {
            return false;
    }
    else {
        return true;
    }
}
}