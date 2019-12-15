import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		
		List<Integer> c= new ArrayList<>(); // Collection is an interface (Array list class) implements List
		c.add(4);
		c.add(2);
		c.add(18);
		
//		Iterator it =c.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		Collections.sort(c);
		Collections.reverse(c);  // collections by default mutable
		Collections.shuffle(c);

		for(Object o: c) {
			System.out.println(o);
		}
	}

}
