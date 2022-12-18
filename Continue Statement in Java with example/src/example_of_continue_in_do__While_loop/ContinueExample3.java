package example_of_continue_in_do__While_loop;

public class ContinueExample3 {

	public static void main(String[] args) {
		int j =0;
		do 
		{
			if (j==7)
			{
				j++;
				continue;
			}
			System.out.println(j+ " ");
			j++;
		} while (j<10);
	}

}
