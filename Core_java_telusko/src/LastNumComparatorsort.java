
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LastNumComparatorsort {

	public static void main(String[] args) {

		List<Integer> c = new ArrayList<>(); // sorting the elements according to last number.
		c.add(404);
		c.add(908);
		c.add(189);
		c.add(265);
		
		Comparator<Integer> c1 = (i,j)->i%10>j%10?1:-1;  // using Lambda expression
				
				                     /*
									 * new Comparator<Integer>() 
									 * { public int compare(Integer i, Integer j) 
									 * { return i%10>j%10?1:-1; 
									 * }
									 * };
									 */
		Collections.sort(c, c1);  // we can write here also (i,j)->i%10>j%10?1:-1; with out creating comparator reference

		for (Integer o : c) {
			System.out.println(o);
		}

	}
}