
public class WrapperDemo {

	public static void main(String[] args) 
	{
		int i=5;
		Integer ii=new Integer(i); //Boxing or wrapping the integer object
		i=ii.intValue();           // un boxing or un wrapping
		System.out.println("" +i);
		
		Integer v=i;  //AutoBoxing
		int k=v;   // Auto unboxing
		System.out.println(k);
		
		String str="345";
		int n= Integer.parseInt(str);  // parseInt is static method it takes the value of string & return as an integer
		System.out.println(n);

	}

}
