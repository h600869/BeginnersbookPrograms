package example__Use_of_break_in_a_for_loop;

public class BreakExample2 {

	public static void main(String[] args) {
		int var;
		for (var =100; var >=10; var --)
		{
			System.out.println("var: " + var);
			if (var==99)
			{
				break;
			}
		}
		System.out.println("Out of for-loop");
	}

}
