import java.util.Scanner;
public class Exercise04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		//givens
		double x2 = 0;
		double y2 = radius;
		double angleA = 72; //degrees
		
		//x2 and y2
		double x1 = Math.sin(Math.toRadians(angleA)) * radius;
		double y1 = Math.cos(Math.toRadians(angleA)) * radius;
		double x5 = Math.sin(Math.toRadians(angleA / 2)) * radius;
		double y5 = -1 * Math.cos(Math.toRadians(angleA / 2)) * radius;
		
		//the other side of the pentagon
		double x3 = -x1;
		double y3 = y1;
		double x4 = -x5;
		double y4 = y5;
		
		System.out.printf("(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)\n(%.2f, %.2f)", 
				x1, y1, 
				x2, y2,
				x3, y3,
				x4, y4,
				x5, y5);
		
		input.close();
	}

}
