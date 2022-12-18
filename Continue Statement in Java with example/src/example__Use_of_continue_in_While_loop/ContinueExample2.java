package example__Use_of_continue_in_While_loop;

public class ContinueExample2 {

	public static void main(String[] args) {
		int counter=10;
		while (counter>=0) 
		{
			if (counter ==7)
			{
				//necessary because while loop 
				counter--;
				continue;
			}
			System.out.println(counter + " ");
			counter--;
		}
	}

}
