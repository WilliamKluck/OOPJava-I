//Geometry: n-sided regular polygon
public class Exercise09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon shape1 = new RegularPolygon();
		RegularPolygon shape2 = new RegularPolygon(6, 4);
		RegularPolygon shape3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Shape1: Perimeter:" + shape1.getPerimeter() + "\n Area:" + shape1.getArea());
		System.out.println("Shape2: Perimeter:" + shape2.getPerimeter() + "\n Area:" + shape2.getArea());
		System.out.println("Shape3: Perimeter:" + shape3.getPerimeter() + "\n Area:" + shape3.getArea());
	}

}

class RegularPolygon{
	
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return this.side * this.n;
	}
	
	public double getArea() {
		return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI/this.n));
	}
}