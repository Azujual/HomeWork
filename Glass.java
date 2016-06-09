
public class Glass extends Circle{
	int h;
	
	Glass (int x, int y, int r, int h){
		super(x,y,r);
		this.h = h;
	}
	
	double volume (Glass g){
		
		return g.csquare(g) * g.h;
	}
	
	double volume (int x, int y, int r, int h){
		
		return csquare(r) * this.h;
	}
	
}
