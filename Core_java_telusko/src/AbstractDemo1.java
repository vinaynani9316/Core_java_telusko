class Printer
{
	public void show (Number i) // Number is an abstract class. Integer,double,float extends Number is a super class implements serializable for integer.
	{
		System.out.println(i);   // we can't create an object of number because it is abstract class.
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) 
	{
        	Printer p =new Printer();
        	p.show(7.9);   //double
        	p.show(6);     // integer
	}

}
