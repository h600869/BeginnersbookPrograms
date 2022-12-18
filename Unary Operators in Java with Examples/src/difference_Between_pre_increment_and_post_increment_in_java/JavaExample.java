package difference_Between_pre_increment_and_post_increment_in_java;

public class JavaExample {

	public static void main(String[] args) {
		int num1 = 5, num2 = 5;
		
		//post-increment
		/*Didn't execute as the value of num1 is still 5 during comparison and only
		 * gets incremented after the condition is already evaluated.
		 */
		if(num1++ == 6) {
			System.out.println("First if block");
			System.out.println("Value of num1: " + num1);
		}
		
		//pre-increment
		/*Got executed because pre-increment increased the value instantly 
		 * before reading the remaining statement,
		 * this made the value of num2 to 6 before comparison
		 */
		if(++num2 ==6) {
			System.out.println("Second if block");
			System.out.println("Value of num2: " + num2);
		}
	}

}
