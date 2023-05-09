import java.util.Scanner;
public class Exercise04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the length of a side: ");
		double lengthOfSides = input.nextDouble();
		
		double areaOfPolygon = (numberOfSides * Math.pow(lengthOfSides, 2)) 
								/ (4 * Math.tan(Math.PI / numberOfSides));
		
		System.out.printf("The area of the polygon is %f", areaOfPolygon);
		
		input.close();
	}

}
