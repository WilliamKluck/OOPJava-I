//Fan Class
public class Exercise09_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.isOn(true);
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.isOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}

class Fan{
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isOn() {
		return this.on;
	}
	public void isOn(boolean value) {
		this.on = value;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Fan(){
		
	}
	
	public String toString() {
		if (this.on) {
			return "" + this.speed + this.color + this.radius;
		}
		return "" + this.color + this.radius + "fan is off";

	}
	
}
