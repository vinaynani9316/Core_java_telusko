
public class Symposium {

	public static void main(String[] args)
	{
		X(1, Integer.MAX_VALUE+1);
	}
	public static void X(int v1, int v2)
	{
		System.out.println("1");
	}
	public static void X(int...v)
	{
		System.out.println("2");
	}

}
