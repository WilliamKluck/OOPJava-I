import java.util.Scanner;
public class Exercise05_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String sentence = input.nextLine();
		input.close();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int character=0; character < sentence.length(); character++) {
			if (Character.isLetter(sentence.charAt(character))) {
			if (Character.toUpperCase(sentence.charAt(character)) == 'A' || Character.toUpperCase(sentence.charAt(character)) == 'E' || 
				Character.toUpperCase(sentence.charAt(character)) == 'I' || Character.toUpperCase(sentence.charAt(character)) == 'O' || 
				Character.toUpperCase(sentence.charAt(character)) == 'U'){
				vowelCount++;
			}
			else if (sentence.charAt(character) == ' ') {}
			else {
				consonantCount++;
			}
			}
		}
		System.out.printf("The number of vowels is %d%n"
				+ "The number of consonants is %d", vowelCount, consonantCount);
	}
}
