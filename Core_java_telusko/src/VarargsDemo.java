class Cal
{
	public int add(int ...n) // it will take like an array of elements {4,90, 6,7,9,2,0} known variable length args
	{
		int sum=0;
		for(int i: n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) 
	{
		
		 Cal c=new Cal();
		
		 System.out.println(c.add(4,90,6,7,9,2,0));
		 c.add(4,7,6);
		 System.out.println(c+ ""); //  leads to hash code of object

	}

}
