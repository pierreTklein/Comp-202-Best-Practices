package bestPractices;

public class BestPracticesSolutions {
public static void main(String[] args) {
	String[] mysteryArray = {"Hello","world"};
	
	System.out.println("Hey, thanks for running me!");
	System.out.println("===========================");
	System.out.println("Running countNumIterations()");
	countNumIterations(10);
	System.out.println("===========================");	
	System.out.println("Running the misnamed 'foo' method");
	String concatenatedStr = concatenateStrings(mysteryArray);
	System.out.println("The result of 'foo' was: "+ concatenatedStr);
	System.out.println("===========================");	
	System.out.println("Running cases(2)");
	String casesResult = cases(2);
	System.out.println("The result of cases(2) was: "+ casesResult);
	
}
	/*
	 * Fixing this involves indenting properly, as shown below. In this case, 
	 * we can easily see that the number of iterations is incremented only when
	 * i is a multiple of 3, which does not happen at every loop. So, we will move
	 * that outside of the if-statement to fix that bug.
	 */
	public static void countNumIterations(int n) {
		int numberOfIterations = 0;
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				i*=3;
				i/=3;
			}
			numberOfIterations++;
		}
		//it's much easier to see here that the variable 'i' is not declared here.
		System.out.println("The number of iterations I made was: " + numberOfIterations);
	}
	
	/*	
	 * This method takes as input a String array and returns the String version
	 * of that array, in this format: [<String 1>,<String 2>,...,<String n>]
	 */
	public static String concatenateStrings(String[] stringsToConcatenate) {
		String concatenatedString = "[";
		for(int i = 0; i < stringsToConcatenate.length; i++) {
			if(i != stringsToConcatenate.length - 1) {
				concatenatedString += stringsToConcatenate[i] + ",";				
			}
			else {
				concatenatedString += stringsToConcatenate[i];
			}
		}
		return concatenatedString + "]";
	}
	
	/*
	 * We can make a String variable whose initial value is the "else" case. For 
	 * each of the if statements, we can change that String variable, return that
	 * variable at the end of the method.
	 */
	public static String cases(int caseNumber){
		String caseString = "Error";
		if(caseNumber==1){ 
			caseString = "Case 1";
	 	} else if(caseNumber==2){
	 		caseString = "Case 2"; 
		} else if(caseNumber==3){ 
			caseString = "Case 3"; 
		}
		return caseString;
	}
}
