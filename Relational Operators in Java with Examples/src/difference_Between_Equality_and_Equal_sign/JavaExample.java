package difference_Between_Equality_and_Equal_sign;

public class JavaExample {
	public static void main (String args[]) {
		int num1, num2;
		
		// = Operator
		num1 = 10; //This is assignment, value 10 is assigned to num1
		num2 = 20; //Value 20 is assigned to num2
		
		/* == Operator used here to compare the values of num1 & num2
		 * it returns either true or false. In this case, it returned false
		 * and that 'false' value is assigned to b using = operator
		 */
		 boolean b = (num1 ==num2);
		 
		 System.out.println(b);
	}
}
