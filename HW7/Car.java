

import java.awt.*;
public class Car {
   
    private int x, y;
    private java.awt.Color color;
    private boolean bool;
   
  
    public Car () {
        x = 0;
        y = 65;
        color = Color.GREEN;
        bool = true;
    }   
    public Car (int x, int y, Color color, boolean bool){
        this.x = x > 0 ? x: 0;
        this.y = y > 40 ? y : 40;
        this.color = color;
        this.bool = bool;
    }   
    public void draw (Graphics g){
        g.setColor (color);
        int xs[] = {x*2, x*2+15, x*2+65, x*2+100};
        int ys[] = {y, y-20, y-20, y};
        g.fillPolygon (xs, ys, 4);
        g.fillRoundRect (x*2, y, 105, 20, 5,5);
        g.setColor (Color.black);
        g.fillOval (10 + x*2, y+20, 18, 18);
        g.fillOval (70 + x*2, y+20, 18, 18);
    }   
    public void move (Graphics g){
        x++;
        draw (g);
    }
}
