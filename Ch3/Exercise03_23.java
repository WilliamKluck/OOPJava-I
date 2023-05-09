import java.util.Scanner;
public class Exercise03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double width = 10;
		double height = 5.0;
		boolean isInsideRectangle = x <= width / 2 && y <= height / 2 && x >= -width / 2 && y>= -height / 2;
		
		if (isInsideRectangle) {
			System.out.println("Point (" + x + ", " + y + ") is inside the rectangle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not inside the rectangle");
		}
		input.close();
	}

}
 