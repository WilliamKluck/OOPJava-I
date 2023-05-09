import java.util.Scanner;
public class Exercise06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 doubles seperated by a space: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
		input.close();
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					
				}
				else {
					double temp = num2;
					num2 = num3;
					num3 = temp;
				}
			}
			else {
				double temp = num1;
				num1 = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		else if(num2 > num3){
			double temp = num1;
			num1 = num2;
			num2 = temp;
			if (num2 > num3) {
			}
			else {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
		}
		else {
			double temp = num1;
			num1 = num3;
			num3 = temp;
		}
		System.out.printf("%.2f %.2f %.2f", num3, num2, num1);
	}
}
