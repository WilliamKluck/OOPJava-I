import java.util.Scanner;
public class Exercise08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a2d = getArray();
		
		double[] columnSum = new double[a2d[0].length];
		for(int column = 0; column < a2d[0].length; column++) {
			columnSum[column] = sumColumn(a2d, column);
		}
		
		printArray(columnSum);
	}
	
	public static double[][] getArray() {
		double[][] matrix = new double[3][4];
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
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int row = 0; row < m.length; row++) {
			total += m[row][columnIndex];	
		}
		return total;	
	}
	
	public static void printArray(double[] m) {
		for (int column = 0; column < m.length; column++) {
			System.out.println("Sum of the elements at column " + column 
					+ " is " + m[column]);
		}
	}
	
}
