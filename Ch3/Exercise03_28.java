import java.util.Scanner;
public class Exercise03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double rectangle1_Left = x1 - width1 / 2;
		double rectangle1_Right = x1 + width1 / 2;
		double rectangle1_Top = y1 + height1 / 2;
		double rectangle1_Bottom = y1 - height1 / 2;
		
		double rectangle2_Left = x2 - width2 / 2;
		double rectangle2_Right = x2 + width2 / 2;
		double rectangle2_Top = y2 + height2 / 2;
		double rectangle2_Bottom = y2 - height2 / 2;
		
		if (x2 <= rectangle1_Right && x2 >= rectangle1_Left) {
			if (y2 <= rectangle1_Top && y2 >= rectangle1_Bottom) {
				//R2 CENTER IS INSIDE R1
				if (	rectangle1_Right < rectangle2_Right 
						|| rectangle1_Left > rectangle2_Left 
						|| rectangle1_Top < rectangle2_Top 
						|| rectangle1_Bottom > rectangle2_Bottom) {
					System.out.println("r2 overlaps r1");
				}
				else {
					System.out.println("r2 is inside r1");
				}
			}
			else if (y2 > rectangle1_Top && rectangle1_Top > rectangle2_Bottom 
					|| y2 < rectangle1_Bottom && rectangle1_Bottom < rectangle2_Top) {
				System.out.println("r2 overlaps r1");
			}
			else {
				System.out.println("r2 does not overlap r1");
			}
			
		}
		else if(x2 > rectangle1_Right && rectangle1_Right > rectangle2_Left
				|| x2 < rectangle1_Left && rectangle1_Left < rectangle2_Right) {
			System.out.println("r2 overlaps r1");
		}
		else {
			System.out.println("r2 does not overlap r1");
		}
		
		input.close();
	}
}