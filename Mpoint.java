public class Mpoint {
	int x,y;
	
	Mpoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double distance (int x, int y){
		int dx = this.x - x;
		int dy = this.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	double distance (Mpoint p) {
		return distance(p.x, p.y);
	}
	
}
