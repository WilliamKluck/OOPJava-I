import java.util.Scanner;
public class Exercise04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %f", area);
		
		input.close();
	}

}
