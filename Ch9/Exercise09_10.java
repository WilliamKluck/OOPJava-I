//Algebra quadratic equations
import java.util.Scanner;
public class Exercise09_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation quad = new QuadraticEquation(a, b, c);
		if(quad.getDiscriminant() > 0) {
			System.out.println("The 2 roots are: " + quad.getRoot1() + " " + quad.getRoot2());
		}
		if(quad.getDiscriminant() == 0) {
			System.out.println("The roots is: " + quad.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}
		input.close();
	}

}

class QuadraticEquation{
	
	private double a = 1;
	private double b = 1;
	private double c = 1;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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
	
	public double getDiscriminant() {
		return Math.pow(this.b, 2) - (4 * this.a * this.c);
	}
	
	public double getRoot1() {
		if (this.getDiscriminant() >= 0) {
			return (-this.b + Math.sqrt(this.getDiscriminant())) / ( 2 * this.a);
		}
		else {
			return 0;
		}
	}
	
	public double getRoot2() {
		if (this.getDiscriminant() >= 0) {
			return (0 - this.b - Math.sqrt(this.getDiscriminant())) / ( 2 * this.a);
		}
		else {
			return 0;
		}
	}
	
}