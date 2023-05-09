
public class Exercise04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define locations of 4 cities
		double xAtlanta = 33.7489954;
		double yAtlanta = -84.3879824;
		double xCharlotte = 35.2270869;
		double yCharlotte = -80.8431267;
		double xSavannah = 32.0835407;
		double ySavannah = -81.0998342;
		double xOrlando = 28.5383355;
		double yOrlando = -81.3792365;
		
		double radiusOfEarth = 6371.01; //kilometers
		//compute distance to each city
		double distanceAtlantaToCharlotte = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(xAtlanta)) 
				* Math.sin(Math.toRadians(xCharlotte)) + Math.cos(Math.toRadians(xAtlanta)) 
				* Math.cos(Math.toRadians(xCharlotte)) * Math.cos(Math.toRadians(yAtlanta) 
				- Math.toRadians(yCharlotte)));
		double distanceCharlotteToSavannah = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(xCharlotte)) 
				* Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xCharlotte)) 
				* Math.cos(Math.toRadians(xSavannah)) * Math.cos(Math.toRadians(yCharlotte) 
				- Math.toRadians(ySavannah)));
		double distanceAtlantaToOrlando = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(xAtlanta)) 
				* Math.sin(Math.toRadians(xOrlando)) + Math.cos(Math.toRadians(xAtlanta)) 
				* Math.cos(Math.toRadians(xOrlando)) * Math.cos(Math.toRadians(yAtlanta) 
				- Math.toRadians(yOrlando)));
		double distanceOrlandoToSavannah = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(xOrlando)) 
				* Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xOrlando)) 
				* Math.cos(Math.toRadians(xSavannah)) * Math.cos(Math.toRadians(yOrlando) 
				- Math.toRadians(ySavannah)));
		double distanceCharlotteToOrlando = radiusOfEarth * Math.acos(Math.sin(Math.toRadians(xCharlotte)) 
				* Math.sin(Math.toRadians(xOrlando)) + Math.cos(Math.toRadians(xCharlotte)) 
				* Math.cos(Math.toRadians(xOrlando)) * Math.cos(Math.toRadians(yCharlotte) 
				- Math.toRadians(yOrlando)));
		
		//find area of 2 triangle of cities
		double s1 = (distanceAtlantaToCharlotte + distanceAtlantaToOrlando + distanceCharlotteToOrlando) / 2;
		double area1 = Math.pow(s1 * (s1 - distanceAtlantaToCharlotte) * (s1 - distanceAtlantaToOrlando) * (s1 - distanceCharlotteToOrlando), 0.5);
		double s2 = (distanceCharlotteToSavannah + distanceOrlandoToSavannah + distanceCharlotteToOrlando) / 2;
		double area2 = Math.pow(s2 * (s2 - distanceCharlotteToSavannah) * (s2 - distanceOrlandoToSavannah) * (s2 - distanceCharlotteToOrlando), 0.5);
		
		//combine triangles and output
		double polygonArea = area1 + area2;
		System.out.printf("The area of the triangle is %f", polygonArea);
	}

}
