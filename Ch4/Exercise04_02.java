import java.util.Scanner;
public class Exercise04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Latitude and longitude measured in North and West 
		//for South and East use negative numbers
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double radiusOfEarth = 6371.01; //kilometers
		double distance = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(x1)) 
				* Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) 
				* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) 
				- Math.toRadians(y2)));
		
		System.out.printf("The distance between two points is %.11f km", distance);
		
		input.close();
	}

}
