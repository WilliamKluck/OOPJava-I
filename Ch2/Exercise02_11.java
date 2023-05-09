import java.util.Scanner;
public class Exercise02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pop = 312032486; //initial population
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		int yearof = 365; //days per year
		double births = 86400 / 7.0; //births per day
		double deaths = 86400 / 13.0; //deaths per day
		int migrants = 86400 / 45;
		double popgrowth = births - deaths + migrants;
		int output = (int)(pop +(years * yearof * popgrowth));
		System.out.print("The population in " + years + " years is " + output);
		input.close();
	}

}
