import java.util.*;
public class RectangleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle(214,255 , new Point(43,32)));
		list1.add(new Rectangle(502,60 , new Point(8,2)));
		list1.add(new Rectangle(10,02 , new Point(4,3)));
		list1.add(new Rectangle(61,2123 , new Point(2,212)));
		list1.add(new Rectangle(51,241 , new Point(2222,12)));
		list1.add(new Rectangle(121,214 , new Point(30,213)));
		list1.add(new Rectangle(44,22 , new Point(1231,2)));
		list1.add(new Rectangle(21,221 , new Point(213,30)));
		list1.add(new Rectangle(1231,211 , new Point(42,30000)));
		list1.add(new Rectangle(1,131 , new Point(4213,30)));
		
		System.out.println("Unsorted List: ");
		System.out.println(list1);
        Collections.sort(list1);
		System.out.println("Sorted List: ");
		System.out.println(list1);

	}

}
