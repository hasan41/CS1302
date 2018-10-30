
public class PointClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab03 P1 = new Lab03(0, 0);
		P1.setx(1);
		P1.sety(-2);
		int x = P1.getx();
		int y = P1.gety();
		
		
		Lab03 P2 = new Lab03(0,0);
		P2.setx(-2);
		P2.sety(4);
		int a = P1.getx();
		int b = P1.gety();
		
        System.out.println(P1.toString());
        System.out.println(P2.toString());


		System.out.println("The Quadrant is: "+ P1.quadrant());
		System.out.println("The other Quadrant is: " + P2.quadrant());

		
		System.out.println(P1.isVertical(x));
		System.out.println(P1.isVertical(y));
		
		System.out.println(P2.isVertical(a));
		System.out.println(P2.isVertical(b));
		
		
	}

}


/*System.out.println(Point1.getx());
System.out.println(Point1.gety());*/

