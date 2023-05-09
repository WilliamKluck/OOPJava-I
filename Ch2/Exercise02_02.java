import java.util.Scanner;
public class Exercise02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		final double PI = 3.14159;
		double area = radius * radius * PI;
		double volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume of the cylinder is " + volume);
		input.close();
	}

}
