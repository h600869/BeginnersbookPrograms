package logical__AND__Operator_Example;

public class JavaExample {

	public static void main(String[] args) {
		int mathVar = 94, scienceVar=99;
		
		//Checking whether marks in both the subjects are
		//greater than 95
		if (mathVar>=95 && scienceVar>=95) {
			System.out.println("Admission granted.");
		}
		else {
			System.out.println("Sorry! Admission is not granted.");
		}
	}

}
