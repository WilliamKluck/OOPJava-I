import java.util.Scanner;
public class Exercise08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a2d = getArray();
		
		double sum = sumMajorDiagonal(a2d);
		
		System.out.println("Sum of the elements in the major diagonal is"
				+ sum);
	}
	
	public static double[][] getArray(){
		double[][] matrix = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " +
		matrix[0].length + " columns: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		input.close();
		return matrix;
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}
