import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args)
	{
		Map<String, String> m= new HashMap<>(); // we can use treemap to insert in sorted order
		
		m.put("myname", "vinay");
		m.put("actor", "ram");
		m.put("ceo", "ceo"); // key should be unique.
		m.put(" ", " raju"); // Hash map allows one null key & n no.of null values & it is not thread safe.
		
		Set<String> keys=m.keySet();
		
		for(String key: keys)
		{
			System.out.println(key + " " + m.get(key));
		}

	}

}
