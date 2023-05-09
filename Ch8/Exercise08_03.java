public class Exercise08_03 {
  /** Main method */
	//live example contains MEAN AND DIFFERENTIAL
  public static void main(String[] args) {
    // Students' answers to the questions
    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    // Key to the questions
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    
    int[][] correct = new int[answers.length][2];
    // Grade all answers
    for (int i = 0; i < answers.length; i++) {
      // Grade one student
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }
      correct[i][0] = i;
      correct[i][1] = correctCount;
    }
    
    for(int startingIndex = 0; startingIndex < correct.length - 1; startingIndex++) {
    	int lowestScore = answers[0].length;
    	int lowestScoreIndex = 0;
    	for (int row = startingIndex; row < correct.length; row++) {
    		if(lowestScore >= correct[row][1]) {
    			if(lowestScore > correct[row][1]) {
    				lowestScore = correct[row][1];
    				lowestScoreIndex = row;
    			}
    			else {
    				if (lowestScoreIndex > correct[row][0]) {
    					lowestScore = correct[row][1];
		    			lowestScoreIndex = row;
    				}
    			}
    		}	
    	}
    	swap(startingIndex, lowestScoreIndex, correct);
    }
    	
    for (int row = 0; row < correct.length; row++) {
    	System.out.println("Student " + correct[row][0] + ": " + correct[row][1]);
    }
  }
  
  public static void swap(int index1, int index2, int[][] m) {
	  for(int column = 0; column < m[index1].length; column++) {
		  int temp = m[index1][column];
		  m[index1][column] = m[index2][column];
		  m[index2][column] = temp;  
	  }
  }
}