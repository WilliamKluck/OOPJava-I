import java.util.Scanner;
public class Exercise04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		char grade = input.next().charAt(0);
		int gpa = 0;
			switch (grade) {
			case 'A': gpa = 4; break;
			case 'B': gpa = 3; break;
			case 'C': gpa = 2; break;
			case 'D': gpa = 1; break;
			case 'F': gpa = 1; break;
			default: System.out.printf("%c is an invalid input", grade);
			System.exit(1);
			}
		System.out.printf("The numberic value of %c is %d", grade, gpa);
		
		input.close();
	}

}
