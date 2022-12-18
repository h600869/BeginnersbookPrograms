package logical_OR_Operator_Example;

public class JavaExample {

	public static void main(String[] args) {
		//let's consider the marks of the same student that we have seen
		//in the first example
		int mathVar =94, scienceVar = 99;
		
		//Checking whether marks in any one of the subject is greater
		//than 98
		if (mathVar >=98 || scienceVar>=98) {
			System.out.println("Admission Granted.");
		}
		else {
			System.out.println("Sorry! Admission is not granted.");
		}
	}

}
