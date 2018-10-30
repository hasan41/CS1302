 public class Circle {
	private double Area;
	private Lab03 p;
	private int radius;
	
	public Circle(Lab03 p, int radius) {
		this.p=p;
		this.radius=radius;
	}
	
	public Lab03 getCenter() {
		return p;
	}
	
	public double getradius() {
		return radius;
	}
	
	
	public double getArea() {
		return Area = (double) (Math.PI * radius * radius);
	}
	
	public double getCircumfrence() {
		return (double) (2 * Math.PI * radius);

	}
	
	public String toString() {
		return "Circle [center = " + p + ", " + "radius= " + radius + "] "; 
	}
	
	public boolean contains(Lab03 p1) {
		//double distance = (double) Math.sqrt ((p.getx() - p1.getx()));
		double distance = (double) Math.sqrt ((p.getx() - p1.getx())*(p.getx() - p1.getx())+(p.gety() - p1.gety())*(p.gety() - p1.gety()));
		if(distance< radius) {
			return true;
		}
		else {
			return false;
		}
		
	}
}