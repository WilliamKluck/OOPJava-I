import java.util.Scanner;
public class Exercise02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: "); 
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double priceOfGallon = input.nextDouble();
		double costOfDrive = priceOfGallon * (1 / mpg) * distance;
		System.out.println("The cost of driving is $" + costOfDrive);
		input.close();
	}

}
