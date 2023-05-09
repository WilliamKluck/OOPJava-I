import java.util.Scanner;
public class Exercise03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double radius = 10;
		boolean isInsideCircle = Math.pow(Math.pow(x , 2) + Math.pow(y, 2), 0.5) < radius;
		
		if (isInsideCircle) {
			System.out.println("Point (" + x + ", " + y + ") is inside the circle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not inside the circle");
		}
		input.close();
	}

}
