import java.util.Scanner;
public class Exercise04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double gross = hoursWorked * hourlyPayRate;
		double federalTax = federalTaxRate * gross;
		double stateTax = stateTaxRate * gross;
		
		System.out.printf("Employee Name: %s\n"
				+ "Hours Worked: %.2f\n"
				+ "Pay Rate: $%.2f\n"
				+ "Gross Pay: $%.2f\n"
				+ "Deductions:\n"
				+ "	Federal Withholding (%.2f%%): $%.2f\n"
				+ "	State Withholding (%.2f%%): $%.2f\n"
				+ "	Total Deduction: $%.2f\n"
				+ "Net Pay: $%.2f\n", name, hoursWorked, hourlyPayRate,
				gross, federalTaxRate * 100, federalTax, stateTaxRate * 100,
				stateTax, federalTax + stateTax, gross - federalTax - stateTax);
		
		input.close();
	}

}
