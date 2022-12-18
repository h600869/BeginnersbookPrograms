package not_Operator_Example;

public class JavaExample {

	public static void main(String[] args) {
		int totalMarks = 32;
		
		//if total marks are not greater than 33 then
		//the student is fail else pass
		if(!(totalMarks >33)) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}

}
