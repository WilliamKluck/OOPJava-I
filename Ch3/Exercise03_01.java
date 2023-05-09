import java.util.Scanner;
public class Exercise03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//receives input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//determine how many roots
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		if(discriminant > 0) {
			System.out.println("The equation has 2 roots: " + r1 + " and " + r2);
		}
		else if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		}
		else {
			System.out.println("The equation has 1 root: " + r1);
		}
		
		input.close();
	}

}
