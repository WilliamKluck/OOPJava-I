import java.util.Scanner;

public class Exercise08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] matrixA = getArray(input);
		double[][] matrixB = getArray(input);
		
		double[][] productAB = multiplyMatrix(matrixA, matrixB);
		if (productAB.length == -1) {
			return;
		}
		
		displayOutput(matrixA, matrixB, productAB);
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
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][b[0].length];
		if(a[0].length != b.length) {
			System.out.println("Error: Impossible Multiplication");
			return new double[-1][];
		}
		for(int row = 0; row < c.length; row++) {
			for (int column = 0; column < c[row].length; column++) {
				double value = 0;
				for (int n = 0; n < a.length; n++) {
					value += a[row][n] * b[n][column];
				}
				c[row][column] = value; 
			}
		}
		return c;
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
