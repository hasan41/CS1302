

public class Question1
{
    // instance variables - replace the example below with your own
    int x;
    int y;
    public static  int multiply(int x, int y)
    {
       if (x == 0 || y == 0) {
           return 0;
        }
        
        else if (y < 0 ) {
            return -x + multiply(x,y+1);
    }
    else {
        return x + multiply(x,y-1);
}
}
public static void main (String[] args) {
    System.out.println(multiply(3,5));
    
}
}
