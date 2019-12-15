
public class IFElse {

	public static void main(String[] args) 
	{
		int n =8;            //if else
		 
		if(n==0)
		{
			System.out.println("nothing");
		}
		else if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		System.out.println("*****");
		//*************
		
		// Ternary 
		
		int i=8, j=0;
		j=i>6?1:2;    // value?-> condition_true? print expression1: else expression2
		
		System.out.println(j);
		
		System.out.println("******");
		
		//switch
		
		int k= 4;
		switch(k)
		{
		case 1: System.out.println("one");
		break;
		
		case 2: System.out.println("two");
		break;
		
		case 3: System.out.println("three");
		break;
		
		case 4: System.out.println("four");
		break;
		 
		default: System.out.println("nomatch");
		
		}
		
		String d= "vinay";
		switch(d)
		{
		case "vinay": System.out.println("ravi");   // Strings & characters can be used in switch statement from java 7 version.
		break;  
		
		case "vinod" : System.out.println("firoz");
		break;
		
		default : System.out.println("noMatching");
		}
				
		
	}

}
