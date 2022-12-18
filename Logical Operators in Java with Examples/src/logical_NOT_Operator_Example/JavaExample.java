package logical_NOT_Operator_Example;

public class JavaExample {

	public static void main (String args[]) {
		int mathVar = 94; //scienceVar = 99;
		
		//In this case, marks in science subject is not required
		//to be checked
		if(!(mathVar<75)) {
			System.out.println("Admission Granted");
		}
		else {
			System.out.println("Sorry! Admission is not granted.");
		}
	}
	
}
