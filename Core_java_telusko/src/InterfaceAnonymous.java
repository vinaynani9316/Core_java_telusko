interface Vu
{
	void show();
}
public class InterfaceAnonymous {

	public static void main(String[] args) 
	{
		Vu v= new Vu()   // Anonymous object creation with the help of interface.
				{
			            public void show()
			            {
			            	System.out.println("im the best");
			            	
			            }
				};
				v.show();
		

	}

}
