import java.util.ArrayList;
import static java.lang.System.*;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> mylist= new ArrayList<String>();
		mylist.add("C");
		mylist.add("Python");
		mylist.add("Java");
		for(String celement:mylist ) {
			out.println(celement);
			
		}
		mylist.remove(1);
		out.println("\nNew List:");
		mylist.add("C#");
		for(String celement:mylist ) {
			out.println(celement);
			
		}
	}

}
