import java.util.Scanner;
public class Exercise05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		String highestScoring = "";
		double highestScore = 0;
		String secondStudent = "";
		double secondScore = 0;
		for(int i=1; i <= numberOfStudents; i++) {
			System.out.print("Enter a student name: ");
			String student = input.next();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			if (score > highestScore) {
				secondScore = highestScore;
				secondStudent = highestScoring;
				highestScore = score;
				highestScoring = student;
			}	
			else if (score > secondScore) {
				secondScore = score;
				secondStudent = student;
			}
		}
		System.out.printf("Top 2 students:%n"
				+ "%s's score is %.1f%n"
				+ "%s's score is %.1f, ",
				 highestScoring, highestScore, secondStudent, secondScore);
		input.close();
	}

}
