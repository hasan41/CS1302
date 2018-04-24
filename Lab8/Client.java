
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Client
{
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle(5,4,6));   
        circleList.add(new Circle(1,0,2)); 
        circleList.add(new Circle(3,4,5));  
        circleList.add(new Circle(2, 3, 8));   
        circleList.add(new Circle(3, 6, 9));  
        circleList.add(new Circle(1,1,1));   
        circleList.add(new Circle(2,0,3)); 
        circleList.add(new Circle(3,9,5));  
        circleList.add(new Circle(8, 7, 6));   
        circleList.add(new Circle(6, 2, 1));  

        System.out.println("unsorted list = " + circleList);
        Collections.sort(circleList);
        System.out.println("sorted list = " + circleList);
    }
}

