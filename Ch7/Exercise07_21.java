
public class Exercise07_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number, sum = 0;
		for (String arg : args) {
		    number = Integer.parseInt(arg);
		    sum = sum + number;
		    ++count;
		}
		System.out.println("You entered " + count + " numbers");
		System.out.println("The sum of these numbers is " + sum);
	}

}
