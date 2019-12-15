class Calculator   //parent class
{
	public int add(int i, int j)
	{
		return i+j;
	}
	
}
class CalcAdv extends Calculator  //child class
{
	public int sub( int i, int j)
	{
		return i-j;
	}
}

class Very extends CalcAdv      //multi level inheritance
{
	public int mul( int i, int j)
	{
		return i*j;
	}
}
public class InheritenceDemo {

	public static void main(String[] args) 
	{
		
		Very c=new Very();
	
		System.out.println(c.add(6, 2));
        System.out.println(c.sub(4, 2));
        System.out.println(c.mul(2, 4));
	}

}
