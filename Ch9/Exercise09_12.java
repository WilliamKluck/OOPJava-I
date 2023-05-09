//Geometry: intersecting point
import java.util.Scanner;
public class Exercise09_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter line1 endpoints (x1,y1) and (x2,y2) EX: 1.2 2.2 3.3 4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("Enter line2 endpoints (x3,y3) and (x4,y4) EX: 1.2 2.2 3.3 4: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = y1 - y2;
		double b = (x1 - x2);
		double c = y3 - y4;
		double d = (x3 - x4);
		double e = a * x1 - b * y1;
		double f = c * x3 - d * y3;
		
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		
		System.out.println("The intersecting line is at (" + linear.getX() + ", " + linear.getY() + ")");
		input.close();
	}

}
 class LinearEquation{
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	
	public boolean isSolvable() {
		if(this.a * this.d - this.b * this.c != 0) {
			return true;
		}
		return false;
	}
	
	public double getX() {
		return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
	}
	
	public double getY() {
		return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c); 
	}
}
