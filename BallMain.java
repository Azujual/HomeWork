import java.text.DecimalFormat;
public class BallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Ball App");
		Ball ball1 = new Ball(5.0, 1.5);
		Ball ball2 = new Ball(23.0, 33.5);
		
		System.out.println("Volume ball1 is: " + df.format(ball1.getVolume()));
		System.out.println("Volume ball2 is: " + df.format(ball2.getVolume()));
		System.out.println();
		System.out.println("Weight ball1 is: " + df.format(ball1.getWeight()));
		System.out.println("Weight ball2 is: " + (float)ball2.getWeight());
		System.out.println();
		ball1.compareVolume(ball2);
		System.out.println();
		ball1.compareWeight(ball2);
	}
	
	
	
}
