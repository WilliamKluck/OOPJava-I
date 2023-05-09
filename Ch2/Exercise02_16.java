import java.util.Scanner;
public class Exercise02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double area = (3 * Math.pow(3, 0.5)) / 2 * Math.pow(side, 2);
		System.out.println("The area of the hexagon is " + area);
		input.close();
	}

}
