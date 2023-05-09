import java.util.Scanner;
public class Exercise05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		String highestScoring = "";
		double highestScore = 0;
		for(int i=1; i <= numberOfStudents; i++) {
			System.out.print("Enter a student name: ");
			String student = input.next();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			if (score > highestScore) {
				highestScore = score;
				highestScoring = student;
			}	
		}
		System.out.printf("Top student %s's score is %.1f", highestScoring, highestScore);
		input.close();
	}

}
