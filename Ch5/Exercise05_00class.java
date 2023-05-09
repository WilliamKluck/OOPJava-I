
public class Exercise05_00class {

	 /** Main method */
	
	public static void main(String[] args) {
	
	 // Display the table heading
	
	 System.out.println(" Multiplication Table");
	
	 // Display the number title
	
	 for(int k=1; k<10; k++) {
		 System.out.printf("%4d", k);
	 }
	 System.out.println("\n-----------------------------------------");
	 for(int k=1; k<10; k++) {
		 System.out.printf("%d | ", k);
		 for(int i=1; i<10; i++) {
			 System.out.printf("%-4d", k*i);
		 }
		 System.out.println();
	 }
	}
}