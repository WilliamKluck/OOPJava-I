import java.util.Scanner;
public class Exercise05_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double GOAL = 30000;
		double sales = GOAL;
		double basePay = 5000;
		double commission=0;
		while (commission + basePay < GOAL) {
			sales = sales + .01;
			if (sales <= 5000) {
				commission = sales * .08;
			}
			else if (sales <= 10000) {
				commission = 5000 * .08 + (sales - 5000) * .10;
			}
			else 
				commission = 5000 * .08 + 5000 * .10 + (sales - 10000) * .12;
			
		}
		System.out.printf("The lowest amount of sales needed to make %.2f is %.2f", GOAL, sales);
		input.close();
	}

}
