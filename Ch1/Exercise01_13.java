
public class Exercise01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double e = 44.5;
		double f = 5.9;
		double x = ((e * d - b * f) / (a * d - b * c));
		double y = ((a * f - e * c) / (a * d - b * c));
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Check " + (a * x + b * y) + " = " + e);
		System.out.println("Check " + (c * x + d * y) + " = " + f);
	}

}
