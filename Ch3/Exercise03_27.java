import java.util.Scanner;
public class Exercise03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of a point: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double line = -0.5 * x + 100;
		
		boolean isTriangle = (y <= line);
		
		if (x >= 0 && y >= 00 && isTriangle) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
		
		input.close();
	}

}
