
public class OperatorDemo 

        /*
         * Arithmetic +, -, *, % 
         * Bitwise
         * Relational
         * Logical
         *  
         * 
         */

{
	public static void main(String [] args)
	{
		 int m=6, n=4;
		 int r1= m+n;
		 int r2= m-n;
		 int r3= m/n; // division value will give only quotient part
		 int r4= m*n;
		 double r5= (double)m/n;
		 int r6= m%n; // mod will give reminder
		 
		 System.out.println(r1);
		 System.out.println(r2);
		 System.out.println(r3);
		 System.out.println(r4);
		 System.out.println(r5);
		 System.out.println(r6);
		 
		//****************************
		 System.out.println("***");
		 int k =4; int j=5;
		 
//		 k=k+j;
//		 k +=j;
//		 k++;  //post increment
//		 ++k;  // pre increment
//		 
		 k=++j;
		 k=j++;
		 System.out.println(k);
		 System.out.println(j);
		 
		 
	}

}
