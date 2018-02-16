package bestPractices;

public class BestPractices {
public static void main(String[] args) {
	String[] mysteryArray = {"Hello","world"};
	
	System.out.println("Hey, thanks for running me!");
	System.out.println("===========================");
	System.out.println("Running countNumIterations()");
	countNumIterations(10);
	System.out.println("===========================");	
	System.out.println("Running the misnamed 'foo' method");
	String concatenatedStr = foo(mysteryArray);
	System.out.println("The result of 'foo' was: "+ concatenatedStr);
	System.out.println("===========================");	
	System.out.println("");
	
}
	/*
	 * This code has a bug, and is super hard to read. How would you fix it?
	 */
	public static void countNumIterations(int n) {
	int numberOfIterations = 0;
	for(int i = 0; i < n; i++) {
	if(i%2==0) {
	i*=3;
	i/=3;
	numberOfIterations++;
	}
	}
	//Note: is the variable 'i' in scope here? It's hard to tell.
	System.out.println("The number of iterations I made was: " + numberOfIterations);
	}
	
	/*	
	 *  This code is also hard to read, but for a different reason: the naming of the 
	 *	method and variables are not great. Try renaming the method and the variables to
	 *	better match what their functions are, and afterwards, add another comment describing
	 *	what the method does.
	 */
	public static String foo(String[] x) {
		String y = "[";
		for(int i = 0; i < x.length; i++) {
			if(i != x.length - 1) {
				y += x[i] + ",";				
			}
			else {
				y += x[i];
			}
		}
		return y + "]";
	}
	
	/*
	 * 	This method is technically correct, but could have errors if it got more complicated.
	 * 	It is generally good practice to reduce the number of return statements you have.
	 * 	How would you change this method to do that?
	 */
	public static String cases(int x){
		if(x==1){ 
			return "Case 1";
	 	} else if(x==2){
			return "Case 2"; 
		} else if(x==3){ 
			return "Case 3"; 
		}
		return "Error";
	}	
}
