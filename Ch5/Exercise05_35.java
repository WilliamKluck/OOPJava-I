
public class Exercise05_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(double i = 1; i<625; i++) {
			sum += 1/(Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.print(sum);
	}

}
