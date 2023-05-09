
public class Exercise04_06 {
//NOT SURE IF ACCURATE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate random points
		final int radius = 40;
		double point1 = Math.random() * 2 * Math.PI;
		double point2 = Math.random() * 2 * Math.PI;
		double point3 = Math.random() * 2 * Math.PI;
		
		//compute coordinates
		double x1 = radius * Math.cos(point1);
		double y1 = radius * Math.sin(point1);
		double x2 = radius * Math.cos(point2);
		double y2 = radius * Math.sin(point2);
		double x3 = radius * Math.cos(point3);
		double y3 = radius * Math.sin(point3);
		
		//compute side lengths
		double distance1To2 = radius * Math.acos(Math.sin(Math.toRadians(x1)) 
				* Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) 
				* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) 
				- Math.toRadians(y2)));
		double distance1To3 = radius * Math.acos(Math.sin(Math.toRadians(x1)) 
				* Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x1)) 
				* Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1) 
				- Math.toRadians(y3)));
		double distance3To2 = radius * Math.acos(Math.sin(Math.toRadians(x3)) 
				* Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x3)) 
				* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y3) 
				- Math.toRadians(y2)));
		
		double angleC = Math.acos((Math.pow(distance1To3, 2) + Math.pow(distance3To2, 2) - Math.pow(distance1To2, 2))
						/ (2 * distance1To3 * distance3To2));
		double angleB = Math.acos((Math.pow(distance1To3, 2) + Math.pow(distance1To2, 2) - Math.pow(distance3To2, 2))
				/ (2 * distance1To3 * distance1To2));
		double angleA = Math.acos((Math.pow(distance1To2, 2) + Math.pow(distance3To2, 2) - Math.pow(distance1To3, 2))
				/ (2 * distance1To2 * distance3To2));
		
		System.out.printf("The 3 angles of the triangle are %f, %f, and %f", angleA, angleB, angleC);
				
	}

}
