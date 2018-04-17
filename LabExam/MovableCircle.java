

public class MovableCircle implements Translate   {

  int x;
  int y;
  int r;

    public MovableCircle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void printCircle() {
        
        System.out.println("x is : " + x + " y is : " + y + " r is : " + r);
        
    }
public void move(int x, int y){
    
    this.x = this.x + x;
    this.y = this.y + y;
    
    
}
   public double size() {
       return r;
       
    }
   public double area() {
       return 3.14 * r * r;
    }
   public void printShape() {
       
       System.out.println( "this is a circle at location" + x + "," + y);
    }
    
    public static void main (String[] args) {
        MovableCircle a = new MovableCircle(3,4,5);
        a.printCircle();
        a.printShape();
        a.move(3,5);
        a.printShape();
        System.out.println(a.size());
        System.out.println(a.area());
        ;
        
        
    }
    
}

