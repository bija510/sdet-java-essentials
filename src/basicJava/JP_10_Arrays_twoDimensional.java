package basicJava;

public class JP_10_Arrays_twoDimensional {

	/********************************************************
	 * Lecture:-13
	 * they are one dimensional and two dimensional
	 * youtube:-ProgrammingKnowledge
	 ********************************************************/
public static void main(String[] args) {
		
	
	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	int x = myNumbers[1][2];
	System.out.println(x); // Outputs 7
	
	
		    int[][] myNum = { {1, 2, 3, 4}, {5, 6, 7} };
		    for (int i = 0; i < myNum.length; ++i) {
		      for(int j = 0; j < myNum[i].length; ++j) {
		        System.out.println(myNum[i][j]);
		      
		  }
		}
	
	
	
	
		
	}

}
