class AS
{ 
	final int DAY; // once final is initialized it will be constant.
	public AS()   
	{
		DAY=4;
	}
}
public class FinalDemo {

	public static void main(String[] args) 
	{
		
		AS obj =new AS();
		System.out.println(obj.DAY);

	}

}
