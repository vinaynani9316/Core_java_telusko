
public class ArrayDemo {

	public static void main(String[] args) 
	{
		/* int nums[]= new int[4];
		nums[0]=8;
		nums[1]=20;
		nums[2]=40;
		nums[3]=60;
		
		nums[2]=99;
		for(int i=0; i<4; i++)
		{
		System.out.println(nums[i]);
		}  */
		
//		int a[]= {1,2,3,4};
//		
//		for( int k :a)
//		{
//			System.out.println(k);    //enhanced for loop
//		}
//		int b[]= {2,4,6,8};
//		int c[]= {5,6,7,9};
		
		int d[][]=                    //jagged array
			{ 
					{1,2,3,4},
					{2,4,6},
					{5,6,7,9,10}
				
		    };
		
//		for(int i=0; i<d.length; i++)  //->rows
//		{
//			for(int j=0; j<d[i].length; j++) //->columns
//			{
//				System.out.print(" " +d[i][j]);
//			}
//			System.out.println();
//		}
//		}
		for(int k[] : d)    // enhanced for loop for jagged array printing.
		{
			for(int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	

	}
}


