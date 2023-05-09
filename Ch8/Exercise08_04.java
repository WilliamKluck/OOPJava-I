
public class Exercise08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] weeklyHours = getArray();
		
		double[][] rowSum = sumRow(weeklyHours);

		sortArray(rowSum);
		
		printArray(rowSum);
	}
	
	public static double[][] getArray(){
		double[][] matrix = {{2, 4, 3, 4, 5, 8, 8},
							{7, 3, 4, 3, 3, 4, 4},
							{3, 3, 4, 3, 3, 2, 2},
							{9, 3, 4, 7, 3, 4, 1},
							{3, 5, 4, 3, 6, 3, 8},
							{3, 4, 4, 6, 3, 4, 4},
							{3, 7, 4, 8, 3, 8, 4},
							{6, 3, 5, 9, 2, 7, 9}};
		return matrix;
	}
	
	public static double[][] sumRow(double[][] matrix) {
		double[][] rowSum = new double[matrix.length][2];
		
		for (int row = 0; row < matrix.length; row++) {
			double total = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
			rowSum[row][0] = row;
			rowSum[row][1] = total;
		}
		return rowSum;
	}
	
	public static void sortArray(double[][] matrix) {
		for(int startingIndex = 0; startingIndex < matrix.length - 1; startingIndex++) {
	    	double highestScore = 0;
	    	int highestScoreIndex = 0;
	    	for (int row = startingIndex; row < matrix.length; row++) {
	    		if(highestScore <= matrix[row][1]) {
	    			if(highestScore < matrix[row][1]) {
	    				highestScore = matrix[row][1];
		    			highestScoreIndex = row;
	    			}
	    			else {
	    				if (highestScoreIndex > matrix[row][0]) {
	    					highestScore = matrix[row][1];
			    			highestScoreIndex = row;
	    				}
	    			}
	    		}	
	    	}
	    	swap(startingIndex, highestScoreIndex, matrix);
	    }
	}
	
	public static void printArray(double[][] m) {
		for(int row = 0; row < m.length; row++) {
			System.out.printf("Employee %.0f: %.0f%n", m[row][0], m[row][1]);
		}
	}
	
	 public static void swap(int index1, int index2, double[][] m) {
		  for(int column = 0; column < m[index1].length; column++) {
			  double temp = m[index1][column];
			  m[index1][column] = m[index2][column];
			  m[index2][column] = temp;  
		  }
	 }
	 
}
