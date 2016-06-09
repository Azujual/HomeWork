# HomeWork
package

abstract void prrint();




public class Mult {

	public static void main(String[] args){
		System.out.println("Max is : " + getMax(1,234,342,454,6,6,67,5,67,543,785,7,877,56));
		System.out.println("Sum is : " + getMax(1,234));
		System.out.println("Sum is : " + getMax(1,234,345));
	}
	
	static double getMax(double ...numbers) {
		double max = Double.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++){
			
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		return max;
	}
	
	static double getMax(double a, double b){
		
		return a + b;
	}
}



классы и пакеты два способа инкапсуляции
