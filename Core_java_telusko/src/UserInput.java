import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Buffered reader & Scanner
public class UserInput {

	public static void main(String[] args) throws IOException 
	
	{
		int n=0;
		System.out.println("enter a number");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // from jdk 1.8 we can write without closing files
		{                                                                              //  & finally block, catch block
		    n=Integer.parseInt(br.readLine());
        }
		
//		try(Scanner scan= new Scanner(System.in)) 
//		{                                                                             
//		    n=scan.nextInt();
//       }
		
        System.out.println(n);
	}

}
