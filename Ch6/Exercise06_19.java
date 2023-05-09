import java.util.Scanner;
public class Exercise06_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 side lengths: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if(isValid(side1, side2, side3)) {
			System.out.printf("The area of the triangle is %f", area(side1, side2, side3));
		}
		else {
			System.out.println("Input is Invalid");
		}
		input.close();
	}
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1 + side2 > side3 &&
			side2 + side3 > side1 &&
			side3 + side1 > side2) {
			return true;
		}
		else {return false;}
	}
	public static double area(double side1, double side2, double side3) {
		double s = 0.5 * (side1 + side2 + side3);
		return Math.sqrt(s* (s - side1) * (s - side2) * (s - side3));
	}
}
