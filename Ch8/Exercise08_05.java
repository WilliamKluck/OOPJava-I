import java.util.Scanner;
public class Exercise08_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	double[][] matrixA = getArray(input);
	double[][] matrixB = getArray(input);
	
	double[][] sumAB = addMatrix(matrixA, matrixB);
	if (sumAB.length == -1) {
		return;
	}
	displayOutput(matrixA, matrixB, sumAB);
	}
	
	public static double[][] getArray(Scanner input){
		double[][] matrix = new double[3][3];
		System.out.println("Enter a 3x3 matrix: ");
		
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		return matrix;
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] indexSum = new double[a.length][a[0].length];
		if (a.length == b.length) {
			for(int row = 0; row < a.length; row++) {
				if(a[row].length == b[row].length) {
					for(int column = 0; column < a[row].length; column++) {
						indexSum[row][column] = a[row][column] + b[row][column];
					}
				}
				else {
					System.out.println("Error: COLUMN MISMATCH:" + row);
					return new double[-1][];
				}
			}
		}
		else {
			System.out.println("Error: ROW MISMATCH: ");
			return new double[-1][];
		}
		return indexSum;
	}
	
	public static void displayOutput(double[][] a, double[][] b, double[][] aB) {
		System.out.println("The addition of the matrices is ");
		for(int row = 0; row < a.length; row++) {
			for(int column = 0; column < a[row].length; column++) {
				System.out.printf("%.1f ", a[row][column]);
			}
			if (row == a.length/2) {
				System.out.print("  +   ");
			}
			else {
				System.out.print("      ");
			}
			for(int column = 0; column < b[row].length; column++) {
				System.out.printf("%.1f ", b[row][column]);
			}
			if (row == a.length/2) {
				System.out.print("  =   ");
			}
			else {
				System.out.print("      ");
			}
			for(int column = 0; column < aB[row].length; column++) {
				System.out.printf("%.1f ", aB[row][column]);
			}
			System.out.println();
		}
		
	}
}
