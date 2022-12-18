package difference_between_pre_decrement_and_post_decrement_in_java;

public class JavaExample {

	public static void main(String[] args) {
		int num1 = 5, num2 = 5;
		
		//post-decrement
		if(num1-- == 4) {
			System.out.println("Post-decrement Operator");
			System.out.println("Value of num1: " + num1);
		}
		
		//pre-decrement
		if(--num2 == 4) {
			System.out.println("Pre-decrement Operator");
			System.out.println("Value of num2: " + num2);
		}
	}

}
