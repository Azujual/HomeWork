
public class Ball extends Circle{
	double density;
	
	Ball (double diameter, double density) {
		super(diameter);
		this.density = density;
	}
	
	double getDensity(){
		return density;
	}
	
	double getVolume(){
		return Math.PI * 4 / 3 * (diameter / 2) * (diameter / 2) * (diameter / 2);
	}
	
	double getWeight(){
		return getVolume() * getDensity();
	}
	
	public void compareVolume(Ball b){
		double volume1 = this.getVolume();
		double volume2 = b.getVolume();
		if (volume1 > volume2) {
			System.out.println("ball1 is larger than ball2.");
		}
		else if (volume1 == volume2) {
			System.out.println("balls are equal");
		}
		else {
			System.out.println("ball2 is larger than ball1.");
		}
	}
	
	public void compareWeight(Ball b){
		if (this.getWeight() > b.getWeight()) {
			System.out.println("ball1 is heavier than ball2.");
		}
		else if (this.getWeight() == b.getWeight()) {
			System.out.println("balls are equal");
		}
		else {
			System.out.println("ball2 is heavier than ball1.");
		}
	}
	
}
