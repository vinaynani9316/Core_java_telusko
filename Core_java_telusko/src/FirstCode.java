
public class FirstCode {

	public static void main(String[] args) 
	{
		System.out.println("Hello vinay");
		int $abc_=50000_000_0;  // 4 bytes -> 32 bits from Jdk 1.5
		$abc_=8;
		System.out.println($abc_);
		
		double percent=5.5;
		float percent1=5.6f;
		System.out.println(percent);
		System.out.println(percent1);
		
		short s= 5; // 2 bytes -> 16 bits
		System.out.println(s);
		
		byte b=10; // 1 byte-> 8 bits
		System.out.println(b);
		
		Long l=500000000000000l;// 8 bytes -> 64 bits
        System.out.println(l);
        
        char c='A';
        c= 66;  // we can store ascii value for char
        System.out.println(c);
        
        double d= 8;   // can store int value in double implicit conversion
        System.out.println(d);
        
        int k=(int)5.9;   // explicit type casting
        System.out.println(k);
        

	}

}
