//Algebra 2x2 linear equations
import java.util.Scanner;
public class Exercise09_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		if(linear.isSolvable()) {
		System.out.println("The solution is (" + linear.getX() + ", " + linear.getY() + ")");
		}
		else{
			  System.out.println("There is no solution");
			}
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