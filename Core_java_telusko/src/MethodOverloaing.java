class Casio
{
	int num1;
	int num2;
	String k1;
	public Casio()
	{
		num1=0;
		num2=0;
		k1="nothing";
		
	}
	
	public Casio(int i)
	{
		num1=i;
		num2=0;
		k1="nothing";
		
	}
	
	public Casio(int i, int j, String op)
	{
		num1=i;
		num2=j;
		k1=op;
				
	}
     /*public void add(int i, int j)
	{
		
			System.out.println(i+j);
		
	}
	public void add(int i, int j, int k)
	{
		
			System.out.println(i+j+k);
		
	}
	public void add(float i, double j, int k)
	{
		
			System.out.println(i+j+k);
		
	} */
}    
public class MethodOverloaing {

	public static void main(String[] args) 
	{
		
		   Casio obj =new Casio(10, 67, "ty");
		 /*  obj.add(8, 2);
		   obj.add(97,6,3);
		   obj.add(9.8f, 5.4, 6); */
		   System.out.println(obj.num1);
		   System.out.println(obj.num2);
		   System.out.println(obj.k1);
           
	}

}
