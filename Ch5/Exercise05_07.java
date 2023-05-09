
public class Exercise05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		double tuitionYearTen = 0;
		double tuitionSum = 0;
		for(int i= 0; i < 13; i++) {
			tuition *= 1.05;
			if (i<10) {
				tuitionYearTen = tuition;
				tuitionSum = tuition;
			}
			else {
				tuitionSum += tuition;
			}
		}
		System.out.printf("Tuition in 10 years is %f%nThe four-year total tuition in ten years is %f", tuitionYearTen, tuitionSum);
	}

}
