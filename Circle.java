
public class Circle extends Mpoint{
	int r;
	final double PI = 3.14;
	
	Circle (int x, int y, int r){
		super(x,y);
		this.r = r;
	}
	
	double csquare (int r) {
		double ss;
		ss = r * r * PI;
		return ss;
	}

	double csquare (Circle c) {
		return csquare(c.r);
	}	
	
}
