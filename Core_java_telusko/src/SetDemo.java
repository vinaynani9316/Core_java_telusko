import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) 
	{
		Set<Integer> s=new HashSet<>(); // we can use treeset for sorted implementation
		System.out.println(s.add(29));
		System.out.println(s.add(34));
		System.out.println(s.add(10));
		System.out.println(s.add(20));
		System.out.println(s.add(34));  // add() return boolean value & set doesn't allow duplicate values.
		
		for(int i: s)
		{
			System.out.println(i);
		}
		

	}

}
