package adding_Elements_To_Array_In_Java;
import java.util.*;
public class JavaExample {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Steve");
		arrList.add("Tim");
		arrList.add("Lucy");
		arrList.add("Pat");
		arrList.add("Angela");
		arrList.add("Tom");
		
		
		//Displaying elements
		System.out.println(arrList);
		
		//Adding "Steve" at the fourth position
		arrList.add(3,"Steve");
	
		//Displaying elements
		System.out.println(arrList);
	}

}
