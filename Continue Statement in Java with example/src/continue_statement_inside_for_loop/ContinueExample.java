package continue_statement_inside_for_loop;

public class ContinueExample {

	public static void main(String[] args) {
		for (int j=0; j<=6; j++) {
			
			if (j==4) {
				continue;
			}
			
			System.out.println(j+" ");
		}
	}

}
