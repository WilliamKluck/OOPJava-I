import java.util.Scanner;
public class Exercise02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilogram = 0.454 * pounds;
		System.out.print(pounds +" pounds is " + kilogram + " kilograms");
		input.close();
	}

}
