package debuggingTutorial;

public class DebuggerCodeSolutions {	
	/*
	 * By placing a breakpoint at line 34: "if(i%2==1) {" (which is now: "if(i%2==0 && i!=0) {"), 
	 * you can check whether the if-statement is doing what it should be doing
	 *  for each iteration of the for-loop. You will note that the cases of the modulo are actually not
	 *  correct! i%2==1 should be i%2==0. But when you run that, it seems to subtract the first number
	 *  in the for-loop, which is not what was asked. So, we need to make sure that i is not equal to 0, which
	 *  is the index of the first number. Likewise for i%3: if we do not include the check for whether
	 *  i is 0, we will multiply sum by the first number!!
	 *  
	 *  Note: Alex decided to start their counting from 1. This is usually a bad coding practice.
	 *  We wrote an alternative solution below this, called "weirdSummations2"
	 */
	public static int weirdSummations(int[] numbers) {
		int sum = 0;
		for(int i = 1; i <= numbers.length; i++) {
			if(i%2==0 && i != 0) {
				sum -= numbers[i-1];
			}
			else if(i%3==0 && i != 0) {
				sum *= numbers[i-1];
			}
			else {
				sum += numbers[i-1];
			}
		}
		return sum;
	}
	public static int weirdSummations2(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(i%2==1) {
				sum -= numbers[i];
			}
			else if(i%3==2) {
				sum *= numbers[i];
			}
			else {
				sum += numbers[i];
			}
		}
		return sum;
	}

	/*
	 * There were two errors here. The first that you run through is that there is a division by zero,
	 * because Alex chose to write "numbers.length-1-i", when the -1 was not actually necessary.
	 * The second error was an "off-by-one" error. This could be fixed by changing the "<=" to a "<".
	 */
	public static int[] divideElementsInArray(int[] numbers) {
		int[] newNumbers = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i]/ (numbers.length - i);
		}
		return newNumbers;
	}
}
