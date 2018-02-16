package debuggingTutorial;

import java.util.Arrays;

public class DebuggerCode {
	public static void main(String[] args) {
		testMethods();
	}
	
	public static void testMethods() {
		int[] arrayForWeirdSummations = {5, 2, 10};
		String inputForWeirdSummationsAsString = Arrays.toString(arrayForWeirdSummations);
		String IncorrectOutputForWeirdSummations = Integer.toString(weirdSummations(arrayForWeirdSummations));
		String CorrectOutputForWeirdSummations = Integer.toString(DebuggerCodeSolutions.weirdSummations(arrayForWeirdSummations));
		printFunctionInputAndOutput(
									"weirdSummations",
									inputForWeirdSummationsAsString,
									IncorrectOutputForWeirdSummations,
									CorrectOutputForWeirdSummations
								);

		int[] arrayForDivisions = {10,2,20};
		String inputForDivideElementsInArray = Arrays.toString(arrayForDivisions);
		String incorrectOutputForDivideElementsInArray = "";
		try {
			incorrectOutputForDivideElementsInArray = Arrays.toString(divideElementsInArray(arrayForDivisions));
		} catch(Exception e) {
			incorrectOutputForDivideElementsInArray ="Error in the method: '" + e.getMessage() + "'";
		}
		String correctOutputForDivideElementsInArray = Arrays.toString(DebuggerCodeSolutions.divideElementsInArray(arrayForDivisions));
		printFunctionInputAndOutput(
									"divideElementsInArray",
									inputForDivideElementsInArray,
									incorrectOutputForDivideElementsInArray,
									correctOutputForDivideElementsInArray
								);		
	}
	
	
	/**
	 * Helper method that prints function name, input value, current output, and correct output.
	 * @param fnName
	 * @param inputVals
	 * @param incorrectOutputVals
	 * @param correctOutputVals
	 */
	public static void printFunctionInputAndOutput(String fnName, String inputVals, String incorrectOutputVals, String correctOutputVals) {
		System.out.println("The output of "+fnName+" with input:" + inputVals + " was: " + incorrectOutputVals + ", and should be: " + correctOutputVals);
	}
	
	
	/*
	 * Alex, a student in Comp 202, was told to write a method that takes as input an array of integers, 
	 * and does some strange operations on them:
	 *  - every second integer subtracts from the sum
	 *  - every third integer multiplies the sum
	 *  - every other integer is added to the sum
	 *  However, upon testing, they realize that the input {5,2,10} does not return (5-2)*10 = 30. 
	 *  Where did they go wrong?
	 *	Use the debugger here to figure out what the logical error is, and fix it.
	 */
	public static int weirdSummations(int[] numbers) {
		int sum = 0;
		for(int i = 1; i <= numbers.length; i++) {
			if(i%2==1) {
				sum -= numbers[i-1];
			}
			else if(i%3==0) {
				sum *= numbers[i-1];
			}
			else {
				sum += numbers[i-1];
			}
		}
		return sum;
	}
	/*
	 * Alex was also asked to write a method that divides the numbers of an array by its length minus
	 * its index. Their code crashes, however. Can you figure out what issue(s) their code has (have)? 
	 * Once you find an error, try fixing it, and running it once more.
	 */
	public static int[] divideElementsInArray(int[] numbers) {
		int[] newNumbers = new int[numbers.length];
		for(int i = 0; i <= numbers.length; i++) {
			newNumbers[i] = numbers[i]/ (numbers.length - 1 - i);
		}
		return newNumbers;
	}
}
