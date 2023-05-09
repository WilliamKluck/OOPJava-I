
public class Exercise06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-15s%s%n", "salesAmount", "Commission");
		for(int i = 10000; i <= 100000; i += 5000) {
			System.out.printf("%-15d%.2f%n", i, computeCommission(i));
		}
	}
	public static double computeCommission(double salesAmount) {
		double commission;
		if (salesAmount <= 5000) {
			commission = salesAmount * .08;
		}
		else if (salesAmount <= 10000) {
			commission = 5000 * .08 + (salesAmount - 5000) * .10;
		}
		else 
			commission = 5000 * .08 + 5000 * .10 + (salesAmount - 10000) * .12;
		return commission;
	}
}
