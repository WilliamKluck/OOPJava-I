
public class Exercise01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pop = 312032486; //initial population
		int yearof = 365; //days per year
		double births = 86400 / 7.0; //births per day
		double deaths = 86400 / 13.0; //deaths per day
		int migrants = 86400 / 45;
		double popgrowth = births - deaths + migrants;
		
		System.out.print("Population after 1 year: ");
		System.out.println(pop + (yearof * popgrowth));
		System.out.print("Population after 2 years: ");
		System.out.println(pop + (2 * yearof * popgrowth));
		System.out.print("Population after 3 years: ");
		System.out.println(pop + (3* yearof * popgrowth));
		System.out.print("Population after 4 years: ");
		System.out.println(pop + (4 * yearof * popgrowth));
		System.out.print("Population after 5 years: ");
		System.out.println(pop + (5 * yearof * popgrowth));
	}

}
