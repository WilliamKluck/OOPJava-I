import java.util.Scanner;
public class Exercise03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three edges (length in double): ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		double perimeter = side1 + side2 + side3;
		boolean isValidTriangle = side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
		
		if (isValidTriangle) {
			System.out.println("The perimeter is " + perimeter);
		}
		else {
			System.out.println("The input is invalid.");
		}
		input.close();
	}

}
