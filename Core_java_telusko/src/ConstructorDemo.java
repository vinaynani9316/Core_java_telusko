class Calcu
{
	int num1; 
	int num2;
	int result;
	
	Calcu()      // Default constructor 
	{
		num1=10; 
		num2=20;
		System.out.println("constructor");
	}
	
	Calcu(int n)    // constructor overloading
	{
		num1=n;
	}
	Calcu(double d, int n)
	{
		num2=(int)d;
		num1=n;
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		Calcu obj= new Calcu(8.8, 6);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
		
	}

}
