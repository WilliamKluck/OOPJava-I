import java.util.Scanner;
public class Exercise03_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("Enter x3 y3: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.print("Enter x4 y4: ");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		//format coordinates into ax + by = e AND cx + dy = f
		double a = y1 - y2;
		double b = (x1 - x2);
		double c = y3 - y4;
		double d = (x3 - x4);
		double e = a * x1 - b * y1;
		double f = c * x3 - d * y3;
		
		//Check for solution
		boolean noSolutions = (a * d - b * c == 0);
		if (noSolutions) {
			System.out.println("The two lines are parallel.");
		}
		else {
			double cramersX = (e * d - b * f) / (a * d - b * c);
			double cramersY = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersection point is : (" + cramersX + ", " + cramersY + ")");
		}
		
		input.close();
	}

}
