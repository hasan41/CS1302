
public class CircleClient {

	public static void main(String[] args) {
		
		Lab03 p1 = new Lab03(10, 5);
		Lab03 p2 = new Lab03(5,7);
	
		Circle newcircle = new Circle(p1, 7);
		System.out.print(newcircle);
		System.out.print("\n");
		System.out.println("Area of circle: "+ newcircle.getArea());
		System.out.println("Circumfrence of circle: " + newcircle.getCircumfrence());
		System.out.println("radius: " + newcircle.getradius());
		
		System.out.println(newcircle.contains(p2));
		
		if(newcircle.contains(p2)) {
			System.out.println("Point " + p2 + " lies within the circle");
		}
		else {
			System.out.println("Point " + p2 + " does not lies within the circle");
		}
		
}
}