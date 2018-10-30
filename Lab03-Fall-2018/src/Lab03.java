public class Lab03 {

	private int x;
	private int y;

	
	public Lab03(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public void setx(int x) {
		this.x=x;
	}
	
	public void sety(int y) {
		this.y=y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean isVertical(int i) {
		if(x==i) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int quadrant() {
		if(x>0 && y>0) {
			return 1;
		}
		else if 
		(x<0 && y>0) {
			return 2;
		} 
		else if
		(x<0 && y<0) {
			return 3;
		}
		else if
		(x>0 && y<0) {
			return 4;
		}
		else {
			return 0;
		}
	}
	
	/*public double distance(Lab03 p) {
		return (double) Math.sqrt(((p.x - x) * (p.x-x)) + ((p.y-y) * (p.y-y)));
		
	}*/

}
