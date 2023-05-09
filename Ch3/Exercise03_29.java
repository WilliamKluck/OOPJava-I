import java.util.Scanner;
public class Exercise03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's x-, y-coordinates and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.print("Enter circle2's x-, y-coordinates and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		if (distance <= radius1 - radius2) {
			System.out.println("circle2 is inside circle1");
		}
		else if (distance <= radius1 + radius2) {
			System.out.println("circle2 overlaps circle1");
		}
		else {
			System.out.println("circle 2 does not overlap circle1");
		}
		
		input.close();
	}

}
